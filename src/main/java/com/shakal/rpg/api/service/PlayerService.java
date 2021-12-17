package com.shakal.rpg.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.shakal.rpg.api.contracts.service.ICharacterService;
import com.shakal.rpg.api.contracts.service.IPlayerService;
import com.shakal.rpg.api.dto.combat.CreatureCardDTO;
import com.shakal.rpg.api.dto.combat.PlayersStateDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.JSONMapper;
import com.shakal.rpg.api.model.combatstate.PlayersState;
import com.shakal.rpg.api.model.relation.UserStory;
import com.shakal.rpg.api.repository.PlayersStateDAO;
import com.shakal.rpg.api.repository.UserStoryDAO;
import com.shakal.rpg.api.model.character.Character;

@Service
public class PlayerService implements IPlayerService {

	private PlayersStateDAO playersStateDAO;
	private final SimpMessagingTemplate template;
	private UserStoryDAO userStoryDAO;
	private ICharacterService characterService;
	
	@Autowired
	public PlayerService(PlayersStateDAO playersStateDAO,SimpMessagingTemplate simpMessagingTemplate,
			UserStoryDAO userStoryDAO,ICharacterService characterService) {
		this.template = simpMessagingTemplate;
		this.playersStateDAO = playersStateDAO;
		this.userStoryDAO = userStoryDAO;
		this.characterService = characterService;
	}
	
	@Override
	public PlayersStateDTO updatePlayersLocations(PlayersStateDTO input, long storyId) {
		this.playersStateDAO.save(new PlayersState(storyId,JSONMapper.serializeObjectToJSON(input)));
		this.sendPlayersMessage(storyId, input);
		return input;
	}
	private void sendPlayersMessage(long id, PlayersStateDTO state) {
		this.template.convertAndSend("/topic/players/"+ id, state);
		
	}

	@Override
	public PlayersStateDTO getPlayerStatusByStoryId(long storyId) throws ResourceNotFoundException {
		Optional<PlayersState> search = this.playersStateDAO.findById(storyId);
		PlayersStateDTO result = null;
		if(search.isPresent()) {
			result = new Gson().fromJson(search.get().getPlayersStateJSON(), PlayersStateDTO.class);
		}
		else {
			result = mountPlayersStateOnStory(storyId);
		}
		return result;
	}

	@Override
	public PlayersStateDTO mountPlayersStateOnStory(long storyId) {
		
		List<CreatureCardDTO> resultPlayers = new ArrayList<CreatureCardDTO>();
		for(UserStory userStory:this.userStoryDAO.retrieveAllUsersInStory(storyId)) {
			if(!userStory.isMaster() && userStory.getCharacter() != null) {
				try {
					resultPlayers.add(
							this.characterService.getCharacterTokenById(userStory.getCharacter().getId()));
				} catch (ResourceNotFoundException e) {}
			}
		}
		return new PlayersStateDTO(resultPlayers);
	}

	@Override
	public boolean insertCharacterOnPlayerQueue(Character character, long storyId, long userId) {
		try {
			PlayersStateDTO result = this.getPlayerStatusByStoryId(storyId);
			result.getPlayers().add(this.characterService.getCharacterTokenById(character.getId()));
			this.updatePlayersLocations(result, storyId);
		} catch (ResourceNotFoundException e) {}
		return true;
	}

	
}
