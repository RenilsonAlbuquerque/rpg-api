package com.shakal.rpg.api.mappers;


import java.util.ArrayList;
import java.util.stream.Collectors;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.create.ClassCreateInputDTO;
import com.shakal.rpg.api.dto.create.ClassDetailInputDTO;
import com.shakal.rpg.api.model.character.CharacterClassLevel;
import com.shakal.rpg.api.model.character.Class;
import com.shakal.rpg.api.model.character.ClassLevel;
import com.shakal.rpg.api.model.CreatureLevel;
import com.shakal.rpg.api.model.character.Character;
import com.shakal.rpg.api.model.embedded.CharacterClassLevelId;
import com.shakal.rpg.api.model.embedded.ClassLevelId;

public abstract class ClassMapper {

	public static KeyValueDTO mapEntityToCreateMetadataResumedDTO(Class entity) {
		KeyValueDTO result = new KeyValueDTO();
		result.setId(entity.getId());
		result.setValue(entity.getName());
		return result;
	}
	public static ClassCreateInputDTO mapEntityToCreateMetadataDTO(Class entity) {
		ClassCreateInputDTO result = new ClassCreateInputDTO();
		result.setId(entity.getId());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		return result;
	}
	public static ClassDetailInputDTO mapEntityToCreateMetadataDetail(Class entity) {
		ClassDetailInputDTO result = new ClassDetailInputDTO();
		result.setDescription(entity.getDescription());
		result.setLifeDice(entity.getLifeDice().getValue().toString());
		result.setSavingThrows(entity.getSavingThrows().stream().map(
				atribute -> AtributeMapper.atributeToEntityDTO(atribute)
				).collect(Collectors.toList()));
		result.setProeficiencyChoose(ProeficiencyMapper.mapChooseEntityToDTO(
				entity.getStartingProficiencyOptions()));
		return result;
	}
	public static CharacterClassLevel createFistLevelOfPlayer(ClassLevel classLevel,Character character) {
		CharacterClassLevel firstLevel = new CharacterClassLevel();
		CharacterClassLevelId identifier = new CharacterClassLevelId();
		identifier.setCharacterId(character.getId());
		identifier.setClassId(classLevel.getClasS().getId());
		identifier.setLevelId(classLevel.getLevel().getId());
		firstLevel.setCharacter(character);
		firstLevel.setClassLevel(classLevel);
		firstLevel.setId(identifier);
		return firstLevel;
		
	}
	public static CharacterClassLevel mapUpdateClassLevel(Character character,CreatureLevel level,Class clasS) {
		ClassLevelId classLevelId = new ClassLevelId(clasS.getId(),level.getId());
		ClassLevel classLevel = new ClassLevel();
		classLevel.setClasS(clasS);
		classLevel.setLevel(level);
		classLevel.setId(classLevelId);
		
		
		CharacterClassLevelId characterClassLevelId = new CharacterClassLevelId();
		characterClassLevelId.setCharacterId(character.getId());
		characterClassLevelId.setClassId(clasS.getId());
		characterClassLevelId.setLevelId(level.getId());
		
		CharacterClassLevel characterClassLevel = new CharacterClassLevel();
		characterClassLevel.setCharacter(character);
		characterClassLevel.setClassLevel(classLevel);
		characterClassLevel.setId(characterClassLevelId);
		return characterClassLevel;
	}
}
