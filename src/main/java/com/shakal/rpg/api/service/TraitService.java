package com.shakal.rpg.api.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shakal.rpg.api.dto.info.CharcterTraitDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.CharacterTraitMapper;
import com.shakal.rpg.api.model.character.Character;
import com.shakal.rpg.api.model.character.CharacterTrait;
import com.shakal.rpg.api.repository.CharacterDAO;
import com.shakal.rpg.api.repository.TraitDAO;
import com.shakal.rpg.api.utils.Messages;

@Service
public class TraitService {

	private TraitDAO traitDao;
	private CharacterDAO characterDao;
	
	@Autowired
	public TraitService(TraitDAO traitDao,CharacterDAO characterDao) {
		this.traitDao = traitDao;
		this.characterDao = characterDao;
	}
	@Transactional
	public CharcterTraitDTO getTraitsOfCharacter(long id) throws ResourceNotFoundException {
		Character character = this.characterDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.CHARACTER_NOT_FOUND));
		
		List<CharacterTrait> trait = this.traitDao.getCharacterTraitByCharacterId(id);
		
		if(!trait.isEmpty()) {
			return CharacterTraitMapper.entityToDTO(
					trait.get(0)
					);
		}else {
			return CharacterTraitMapper.createEmptyDto();
		}
	}
	public boolean updateCreatureTraits(CharcterTraitDTO inputDto,long characterId) throws ResourceNotFoundException {
		Optional<CharacterTrait> search = this.traitDao.getCharacterTraitByCharacterIdAndId(characterId,inputDto.getId());
		if(search.isPresent()) {
			this.traitDao.save(CharacterTraitMapper.dtoToEntity(inputDto,search.get().getCharacter()));
		}else {
			Character characterSearch = this.characterDao.findById(characterId)
					.orElseThrow(() -> new ResourceNotFoundException(Messages.CHARACTER_NOT_FOUND));
			this.traitDao.save(CharacterTraitMapper.dtoToEntity(inputDto,characterSearch));
		}
		
		return true;
	}
	
}
