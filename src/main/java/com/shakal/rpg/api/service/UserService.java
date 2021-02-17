package com.shakal.rpg.api.service;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.IUserService;
import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.create.UserCreateDTO;
import com.shakal.rpg.api.dto.create.UserStoryManagementInputDTO;
import com.shakal.rpg.api.dto.edit.UserManagementUpdateDTO;
import com.shakal.rpg.api.exception.DuplicatedResourceException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.PlaceMapper;
import com.shakal.rpg.api.mappers.UserMapper;
import com.shakal.rpg.api.model.Story;
import com.shakal.rpg.api.model.User;
import com.shakal.rpg.api.model.character.Character;
import com.shakal.rpg.api.model.embedded.UserStoryId;
import com.shakal.rpg.api.model.relation.UserStory;
import com.shakal.rpg.api.repository.StoryDAO;
import com.shakal.rpg.api.repository.UserDAO;
import com.shakal.rpg.api.repository.UserStoryDAO;
import com.shakal.rpg.api.security.AuthenticationContext;
import com.shakal.rpg.api.utils.Messages;

@Service
public class UserService implements UserDetailsService, IUserService {

	private UserDAO userDAO;
	private UserStoryDAO userStoryDao;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	private StoryDAO storyDAO;

	@Autowired
	public UserService(UserDAO userDAO, BCryptPasswordEncoder bCryptPasswordEncoder, 
			UserStoryDAO userStoryDao,StoryDAO storyDAO) {
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.userDAO = userDAO;
		this.userStoryDao = userStoryDao;
		this.storyDAO = storyDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		return this.userDAO.findByUsername(username)
				.orElseThrow(() -> new BadCredentialsException(Messages.USER_NOT_FOUND));
	}

	@Override
	public long getCurrentUserId() {
		return ((AuthenticationContext) SecurityContextHolder.getContext().getAuthentication()).getId();
	}

	public void setCharacterToUserInStory(long storyId, long userId, Character character) {

		UserStory userStory = new UserStory();
		userStory.setId(new UserStoryId(userId, storyId));
		userStory.setCharacter(character);
		this.userStoryDao.save(userStory);

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
		   if(this.userStoryDao.retrieveCharacterOfUserInStory(userDto.getId(),inputDto.getStoryId()).isEmpty()) {
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

}
