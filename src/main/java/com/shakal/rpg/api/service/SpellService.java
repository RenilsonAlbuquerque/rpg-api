package com.shakal.rpg.api.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.dto.info.CharacterSpellDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.CharacterSpellMapper;
import com.shakal.rpg.api.model.character.Character;
import com.shakal.rpg.api.model.character.CharacterSpell;
import com.shakal.rpg.api.repository.CharacterDAO;
import com.shakal.rpg.api.repository.CharacterSpellDAO;
import com.shakal.rpg.api.utils.Messages;

@Service
public class SpellService {
	
	private CharacterDAO characterDao;
	private CharacterSpellDAO characterSpellDAO;
	
	@Autowired
	public SpellService(CharacterDAO characterDao,
			CharacterSpellDAO characterSpellDAO) {
		this.characterDao = characterDao;
		this.characterSpellDAO = characterSpellDAO;
	}
	
	public CharacterSpellDTO getSpellsOfCharacter(long id) throws ResourceNotFoundException {
		
		List<CharacterSpell> characterSpellSearch = this.characterSpellDAO.getCharacterSpellByCharacterId(id);
		if(!characterSpellSearch.isEmpty()) {
			CharacterSpell spell = this.characterSpellDAO.getCharacterSpellByCharacterId(id).get(0);
			return CharacterSpellMapper.spellEntityToDto(spell);
		}else {
			return CharacterSpellMapper.createEmptyDTO(id);
		}
		
	
	}
	public boolean updateCreatureSpells(CharacterSpellDTO inputDto,long characterId) throws ResourceNotFoundException {
		Character characterSearch = this.characterDao.findById(characterId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.CHARACTER_NOT_FOUND));
		List<CharacterSpell> search2 = this.characterSpellDAO.getCharacterSpellByCharacterId(characterId);
		
		if(!search2.isEmpty()) {
			this.characterSpellDAO.save(CharacterSpellMapper.spellDtoToEntity(inputDto,characterSearch));
		}else {
			this.characterSpellDAO.save(CharacterSpellMapper.spellDtoToEntity(inputDto,characterSearch));
		}
		
		return true;
	}
	


}
