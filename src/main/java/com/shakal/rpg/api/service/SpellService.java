package com.shakal.rpg.api.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.dto.info.CharacterSpellDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.CharacterSpellMapper;
import com.shakal.rpg.api.model.character.Character;
import com.shakal.rpg.api.model.character.CharacterSpell;
import com.shakal.rpg.api.model.character.CharacterSpellCircle;
import com.shakal.rpg.api.repository.CharacterDAO;
import com.shakal.rpg.api.repository.CharacterSpellCircleDAO;
import com.shakal.rpg.api.repository.CharacterSpellDAO;
import com.shakal.rpg.api.utils.Messages;

@Service
public class SpellService {
	
	private CharacterDAO characterDao;
	private CharacterSpellCircleDAO characterSpellCircleDAO;
	private CharacterSpellDAO characterSpellDAO;
	
	@Autowired
	public SpellService(CharacterSpellCircleDAO characterSpellCircleDAO,CharacterDAO characterDao,
			CharacterSpellDAO characterSpellDAO) {
		this.characterSpellCircleDAO = characterSpellCircleDAO;
		this.characterDao = characterDao;
		this.characterSpellDAO = characterSpellDAO;
	}
	
	public CharacterSpellDTO getSpellsOfCharacter(long id) throws ResourceNotFoundException {
		Character character = this.characterDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.CHARACTER_NOT_FOUND));
		
		if(character.getSpell() != null) {
			return CharacterSpellMapper.spellEntityToDto(
					this.characterSpellDAO.getCharacterSpellByCharacterId(character.getId())
					);
		}else {
			return CharacterSpellMapper.createEmptyDTO(character.getId());
		}
		
	
	}
	public boolean updateCreatureSpells(CharacterSpellDTO inputDto,long characterId) throws ResourceNotFoundException {
		Optional<CharacterSpell> search = this.characterSpellDAO.findById(inputDto.getId());
		if(search.isPresent()) {
			this.characterSpellDAO.save(CharacterSpellMapper.spellDtoToEntity(inputDto));
		}else {
			Character characterSearch = this.characterDao.findById(characterId)
					.orElseThrow(() -> new ResourceNotFoundException(Messages.CHARACTER_NOT_FOUND));
			CharacterSpell characterSpell = CharacterSpellMapper.spellDtoToEntity(inputDto);
			characterSpell.setCharacter(characterSearch);
			characterSpell = this.characterSpellDAO.save(characterSpell);
			
			for(CharacterSpellCircle circle: characterSpell.getSpells()) {
				circle.setCharacterSpell(characterSpell);
				this.characterSpellCircleDAO.save(circle);
			}
		
			this.characterSpellDAO.save(characterSpell);
		}
		
		
		
		
		
		/*
		List<CharacterSpellCircle> entitiesList = creaturesInputDTO.stream().map( characterSpell -> CharacterSpellMapper.dtoToEntity(characterSpell))
                .collect(Collectors.toList());
		
		for(CharacterSpellCircle entity: entitiesList) {
			this.characterSpellCircleDAO.save(entity);
		}
		*/
		return true;
	}
	


}
