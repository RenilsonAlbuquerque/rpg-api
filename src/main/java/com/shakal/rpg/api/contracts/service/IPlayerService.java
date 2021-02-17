package com.shakal.rpg.api.contracts.service;

import com.shakal.rpg.api.dto.combat.PlayersStateDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface IPlayerService {

	PlayersStateDTO updatePlayersLocations(PlayersStateDTO input, long storyId);
	PlayersStateDTO getPlayerStatusByStoryId(long storyId) throws ResourceNotFoundException;
}