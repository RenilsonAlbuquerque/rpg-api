package com.shakal.rpg.api.contracts.service;

import com.shakal.rpg.api.dto.combat.CreatureCardDTO;
import com.shakal.rpg.api.dto.create.CharacterCreateDTO;
import com.shakal.rpg.api.dto.create.CharacterCreateInputDTO;
import com.shakal.rpg.api.dto.create.CharacterHeaderInputDTO;
import com.shakal.rpg.api.dto.filter.UserSheetFIlterDTO;
import com.shakal.rpg.api.dto.info.CharacterGeneralInfoDTO;
import com.shakal.rpg.api.dto.info.CharacterSheetDTO;
import com.shakal.rpg.api.dto.output.CharacterCreateOutputDTO;
import com.shakal.rpg.api.exception.BusinessException;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface ICharacterService {

	CharacterCreateOutputDTO createCharacterInStory(CharacterCreateDTO inputDto) throws  BusinessException,FileManagementException;
	CharacterGeneralInfoDTO getCharacterSheetByUserInStory(UserSheetFIlterDTO filter) throws ResourceNotFoundException;
	CharacterCreateInputDTO getCharacterCreationMetadata();
	CharacterSheetDTO getCharacterSheet(Long id) throws ResourceNotFoundException;
	boolean updateCharacterSheet(CharacterSheetDTO sheetInputDto) throws ResourceNotFoundException;
	CharacterHeaderInputDTO getHeaderInput();
	CreatureCardDTO getCharacterTokenById(long characterId) throws ResourceNotFoundException;
}
