package com.shakal.rpg.api.service.user;



import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.shakal.rpg.api.contracts.service.IUserService;
import com.shakal.rpg.api.dto.combat.CreatureCardDTO;
import com.shakal.rpg.api.dto.combat.PlayersStateDTO;
import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.create.UserCreateDTO;
import com.shakal.rpg.api.dto.create.UserStoryManagementInputDTO;
import com.shakal.rpg.api.dto.edit.UserManagementUpdateDTO;
import com.shakal.rpg.api.exception.DuplicatedResourceException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.CharacterMapper;
import com.shakal.rpg.api.mappers.JSONMapper;
import com.shakal.rpg.api.mappers.UserMapper;
import com.shakal.rpg.api.model.Story;
import com.shakal.rpg.api.model.character.Character;
import com.shakal.rpg.api.model.character.CharacterClassLevel;
import com.shakal.rpg.api.model.combatstate.PlayersState;
import com.shakal.rpg.api.model.embedded.UserStoryId;
import com.shakal.rpg.api.model.relation.UserStory;
import com.shakal.rpg.api.model.user.User;
import com.shakal.rpg.api.repository.CharacterClassLevelDAO;
import com.shakal.rpg.api.repository.CharacterDAO;
import com.shakal.rpg.api.repository.PlayersStateDAO;
import com.shakal.rpg.api.repository.StoryDAO;
import com.shakal.rpg.api.repository.UserStoryDAO;
import com.shakal.rpg.api.repository.user.UserDAO;
import com.shakal.rpg.api.security.authentication.AuthenticationContext;
import com.shakal.rpg.api.utils.Messages;

@Service
public class UserService implements  IUserService {


	private UserDAO userDAO;
	private UserStoryDAO userStoryDao;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	private StoryDAO storyDAO;
	private PlayersStateDAO playersStateDAO;
	private final SimpMessagingTemplate template;
	private CharacterDAO characterDAO;
	private CharacterClassLevelDAO characterClassLevelDAO;

	@Autowired
	public UserService(UserDAO userDAO, BCryptPasswordEncoder bCryptPasswordEncoder, 
			UserStoryDAO userStoryDao,StoryDAO storyDAO,PlayersStateDAO playersStateDAO,
			SimpMessagingTemplate template,CharacterDAO characterDAO,CharacterClassLevelDAO characterClassLevelDAO
			) {
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.userDAO = userDAO;
		this.userStoryDao = userStoryDao;
		this.storyDAO = storyDAO;
		this.playersStateDAO = playersStateDAO;
		this.template = template;
		this.characterDAO = characterDAO;
		this.characterClassLevelDAO = characterClassLevelDAO;
		//this.playerService = playerService;
		
	}

	

	@Override
	public long getCurrentUserId() {
		return ((AuthenticationContext) SecurityContextHolder.getContext().getAuthentication()).getId();
	}
	
	@Override
	public void setCharacterToUserInStory(long storyId, long userId, Character character) {

		UserStory userStory = new UserStory();
		userStory.setId(new UserStoryId(userId, storyId));
		userStory.setCharacter(character);
		this.userStoryDao.save(userStory);
		
		this.updatePlayerQueue(storyId, character.getId(),userId);
	}

	@Override
	public UserCreateDTO insertUser(UserCreateDTO createDto) throws DuplicatedResourceException {
		boolean hasUser = this.userDAO.findByUsername(createDto.getUsername()).isPresent();
		if (hasUser) {
			throw new DuplicatedResourceException(Messages.INVALID_USERNAME);
		}
		createDto.setPassword(this.bCryptPasswordEncoder.encode(createDto.getPassword()));
		this.userDAO.save(UserMapper.createToEntity(createDto));
		return createDto;
	}

	@Override
	public UserStoryManagementInputDTO getUserManagementInput(long storyId) {
		long userId = ((AuthenticationContext) SecurityContextHolder.getContext().getAuthentication()).getId();
		UserStoryManagementInputDTO userManagement = new UserStoryManagementInputDTO();
		userManagement.setAllAvaliableUsers(this.userDAO.retrieveAllUsersExceptId(userId) 
				.stream()
        		.map(user -> UserMapper.entityToKeyValue(user))
                .collect(Collectors.toList()));
		userManagement.setUsersOfStory(this.userStoryDao.retrieveAllUsersInStoryExceptMaster(storyId) 
				.stream()
        		.map(place -> UserMapper.entityToKeyValue(place))
                .collect(Collectors.toList()));
		return userManagement;
	}

	@Override
	public UserManagementUpdateDTO updateUsersInStory(UserManagementUpdateDTO inputDto)
			throws ResourceNotFoundException {
		
		for(KeyValueDTO userDto:inputDto.getUsers()) {
		   if(!this.userStoryDao.retrieveCharacterOfUserInStory(userDto.getId(),inputDto.getStoryId()).isPresent()) {
			   User user = this.userDAO.getOne(userDto.getId());
			   Story story = this.storyDAO.getOne(inputDto.getStoryId());
			   UserStory userStory = new UserStory();
			   UserStoryId userStoryId = new UserStoryId();
			   userStoryId.setStoryId(story.getId());
			   userStoryId.setUserId(user.getId());
			   userStory.setId(userStoryId);
			   userStory.setStory(story);
			   userStory.setUser(user);
			   userStory.setMaster(false);
			   this.userStoryDao.save(userStory);
		   }
		}
		
		return inputDto;
	}
	private void updatePlayerQueue(long storyId,long characterId,long userId) {
		Optional<PlayersState> search = this.playersStateDAO.findById(storyId);
		PlayersStateDTO result = null;
		if(search.isPresent()) {
			result = new Gson().fromJson(search.get().getPlayersStateJSON(), PlayersStateDTO.class);
		}else {
			result = new PlayersStateDTO(new ArrayList<CreatureCardDTO>());
		}
		Character characterSearch = this.characterDAO.getOne(characterId);
		CharacterClassLevel classLevel = this.characterClassLevelDAO.getFirstLevelOfCharacter(characterId);
		characterSearch.setClassLevel(new ArrayList<CharacterClassLevel>());
		characterSearch.getClassLevel().add(classLevel);
		
		result.getPlayers().add(CharacterMapper.mapEntityToCardDTO(characterSearch,userId));
		this.playersStateDAO.save(new PlayersState(storyId,JSONMapper.serializeObjectToJSON(result)));
		this.template.convertAndSend("/topic/players/"+ storyId, result);
		
	}
	
}
