package com.shakal.rpg.api.mappers;


import java.util.stream.Collectors;

import com.shakal.rpg.api.dto.combat.CardPositionDTO;
import com.shakal.rpg.api.dto.combat.CreatureCardDTO;
import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.info.CharacterLifePointsDTO;
import com.shakal.rpg.api.dto.info.CharacterSheetDTO;
import com.shakal.rpg.api.dto.output.CharacterCreateOutputDTO;
import com.shakal.rpg.api.dto.overview.ClassLevelOveriewDTO;
import com.shakal.rpg.api.helpers.CombatHelper;
import com.shakal.rpg.api.model.character.Character;
import com.shakal.rpg.api.model.character.CharacterClassLevel;

public class CharacterMapper {
	
	public static CharacterSheetDTO entityToInfo(Character entity) {
		CharacterSheetDTO result = new CharacterSheetDTO();
		result.setId(entity.getId());
		result.setName(entity.getName());
		result.setImagePath(entity.getImagePath());
		result.setClassLevels(entity.getClassLevel().stream()
				.map(classLevel -> CharacterMapper.classLevelToInfoDTO(classLevel))
				.collect(Collectors.toList()));
		result.setRace(RaceMapper.mapRaceToOverviewDTO(entity.getRace()));
		result.setAlignment(AlignmentMapper.mapEntityTOOverviewDTO(entity.getAlignment()));
		result.setPlayer(PlayerMapper.mapEntityToOverview(entity.getUserStory().get(0).getUser()));
		
		result.setStrength(AtributeMapper.entityToDetailTO(entity.getAtributes(),1));
		result.setDexterity(AtributeMapper.entityToDetailTO(entity.getAtributes(),2));
		result.setConstitution(AtributeMapper.entityToDetailTO(entity.getAtributes(),3));
		result.setInteligence(AtributeMapper.entityToDetailTO(entity.getAtributes(),4));
		result.setWisdom(AtributeMapper.entityToDetailTO(entity.getAtributes(),5));
		result.setCharisma(AtributeMapper.entityToDetailTO(entity.getAtributes(),6));
		
		result.setInspiration(0);
		result.setProeficiencBonus(entity.getClassLevel().get(
				entity.getClassLevel().size() -1).getClassLevel().getLevel().getProeficiencyBonus()
				);
		
		result.setSavins(AtributeMapper.createSavins(entity,result.getProeficiencBonus()));
		result.setProeficiencies(ProeficiencyMapper.createProeficiencyView(entity, result.getProeficiencBonus()));
		
		result.setLanguages(entity.getLanguages().stream()
				.map( language ->  LanguageMappers.entityToDTO(language))
				.collect(Collectors.toList()));
		
		
		result.setBackground(entity.getBackgroundStory());
		result.setAge(entity.getAge());
		result.setHeight(entity.getHeight());
		result.setLifePoints(CharacterMapper.mapLevelToDTO(entity));
		
		result.setArmorClass(entity.getArmorClass());
		result.setInitiative(entity.getDexterity().getModfier());
		result.setSpeed(entity.getSpeed());
		
		return result;
	}
	public static ClassLevelOveriewDTO classLevelToInfoDTO(CharacterClassLevel classLevel) {
		ClassLevelOveriewDTO result = new ClassLevelOveriewDTO();
		KeyValueDTO clasS = new KeyValueDTO();
		clasS.setId(classLevel.getClassLevel().getClasS().getId());
		clasS.setValue(classLevel.getClassLevel().getClasS().getName());
		result.setClasS(clasS);
		
		KeyValueDTO level = new KeyValueDTO();
		level.setId(classLevel.getClassLevel().getLevel().getId());
		level.setValue(Double.toString( classLevel.getClassLevel().getLevel().getValue()));
		result.setLevel(level);
		return result;
		
	}
	public static CharacterLifePointsDTO mapLevelToDTO(Character entity) {
		CharacterLifePointsDTO result = new CharacterLifePointsDTO();
		result.setTotalLifePoints(entity.getTotalLifePoints());
		result.setCurrentLifePoints(entity.getLifePoints());
		result.setTemporaryLifePoints(entity.getTemporaryLifePoints());
		result.setHitDice("2d20");
		return result;
	}
	
	public static Character mapDtoToEntity(Character character, CharacterSheetDTO characterInputDto) {
		character.setArmorClass(characterInputDto.getArmorClass());
		character.setSpeed(characterInputDto.getSpeed());
		character.setLifePoints(characterInputDto.getLifePoints().getCurrentLifePoints());
		if(characterInputDto.getLifePoints().getTotalLifePoints() <= 0) {
			character.setTotalLifePoints(1);
		}else {
			character.setTotalLifePoints(characterInputDto.getLifePoints().getTotalLifePoints());
		}
		character.setTemporaryLifePoints(characterInputDto.getLifePoints().getTemporaryLifePoints());
		character.setExperiencyPoints(characterInputDto.getExperiencyPoints());
		character.setAtributes(CreatureAtributeMapper.mapAtributesDtoToEntity(character.getAtributes(), characterInputDto));
		return character;
	}
	public static CreatureCardDTO mapEntityToCardDTO(Character character) {
		CreatureCardDTO result = new CreatureCardDTO();
		result.setId(character.getId());
		result.setName(character.getName());
		result.setLifePoints(character.getLifePoints());
		result.setLevel(LevelMapper.entityToInfoDTO(character.getClassLevel().get(0).getClassLevel().getLevel()));
		result.setTotalLifePoints(character.getTotalLifePoints());
		//result.setImagePath(characterSheet.getImagePath());
		result.setLifePercent(CombatHelper.calculateLifePercent(character.getTotalLifePoints(), character.getTotalLifePoints()));
		result.setSpeed(character.getSpeed());
		result.setPlayerId(character.getUserStory().get(0).getUser().getId());
		result.setPosition(new CardPositionDTO(0,0));
		result.setSize(1);
		return result;
	}
	
	public static CreatureCardDTO mapEntityToCardDTO(Character character, long playerId) {
		CreatureCardDTO result = new CreatureCardDTO();
		result.setId(character.getId());
		result.setName(character.getName());
		result.setLifePoints(character.getLifePoints());
		result.setLevel(LevelMapper.entityToInfoDTO(character.getClassLevel().get(0).getClassLevel().getLevel()));
		result.setTotalLifePoints(character.getTotalLifePoints());
		//result.setImagePath(characterSheet.getImagePath());
		result.setLifePercent(CombatHelper.calculateLifePercent(character.getTotalLifePoints(), character.getTotalLifePoints()));
		result.setSpeed(character.getSpeed());
		result.setPlayerId(playerId);
		result.setPosition(new CardPositionDTO(0,0));
		result.setSize(1);
		return result;
	}
	public static CharacterCreateOutputDTO entityToOutput(Character character) {
		CharacterCreateOutputDTO result = new CharacterCreateOutputDTO();
		result.setId(character.getId());
		return result;
	}
	
	

}
