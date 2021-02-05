package com.shakal.rpg.api.contracts.service;

import com.shakal.rpg.api.dto.info.BagInfoDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface IBagService {

	 BagInfoDTO getBagOfCharacter(long id) throws ResourceNotFoundException;
	 boolean updateCreatureBag(BagInfoDTO inputDto,long characterId) throws ResourceNotFoundException;
}
