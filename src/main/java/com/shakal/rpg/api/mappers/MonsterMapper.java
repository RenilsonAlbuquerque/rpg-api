package com.shakal.rpg.api.mappers;

import java.util.stream.Collectors;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.create.MonsterCreateDTO;
import com.shakal.rpg.api.dto.info.MonsterInfoDTO;
import com.shakal.rpg.api.dto.overview.MonsterOverviewDTO;
import com.shakal.rpg.api.model.Monster;
import com.shakal.rpg.api.model.MonsterRace;
import com.shakal.rpg.api.model.creature.CreatureSize;

public class MonsterMapper {

	public static MonsterOverviewDTO entityToOverview(Monster entity) {
		MonsterOverviewDTO result = new MonsterOverviewDTO();
		result.setId(entity.getId());
		result.setRace(entity.getRace().getName());
		result.setType(entity.getRace().getMonsterType().getName());
		result.setChallengeLevel(entity.getChallengeLevel().getValue());
		result.setLifePoints(entity.getBaseLifeDice());
		return result;
	}
	public static MonsterInfoDTO entityToInfo(Monster entity) {
		MonsterInfoDTO result = new MonsterInfoDTO();
		result.setRace(entity.getRace().getName());
		result.setProfilePicturePath(entity.getImagePath());
		result.setType(entity.getRace().getMonsterType().getName());
		result.setDescription(entity.getRace().getDescription());
		return result;
	}
	public static KeyValueDTO sizeEntityToDTO(CreatureSize entity) {
		KeyValueDTO result = new KeyValueDTO();
		result.setId(entity.getId());
		result.setValue(entity.getName());
		return result;
		
	}
	public static MonsterCreateDTO entityToMonsterCreateDTO(Monster entity) {
		MonsterCreateDTO result = new MonsterCreateDTO();
		result.setId(entity.getId());
		result.setRaceName(entity.getRace().getName());
		result.setRaceDescription(entity.getRace().getDescription());
		result.setImagePath(entity.getImagePath());
		result.setSize(entity.getSize().getId());
		result.setAlignment(entity.getAlignment().getId());
		result.setType(entity.getRace().getMonsterType().getId());
		
		result.setArmorClass(entity.getArmorClass());
		result.setLifePoints(entity.getBaseLifeDice());
		result.setSpeed(entity.getSpeed());
		
		result.setForce(entity.getForce().getValue());
		result.setProeficientForce(entity.getForce().isProeficiency());

		result.setDexterity(entity.getDexterity().getValue());
		result.setProeficientDexterity(entity.getDexterity().isProeficiency());

		result.setConstitution(entity.getConstitution().getValue());
		result.setProeficientConstitution(entity.getConstitution().isProeficiency());

		result.setInteligence(entity.getInteligence().getValue());
		result.setProeficientInteligence(entity.getInteligence().isProeficiency());

		result.setWisdom(entity.getWisdom().getValue());
		result.setProeficientWisdom(entity.getWisdom().isProeficiency());

		result.setCharisma(entity.getCharisma().getValue());
		result.setProeficientCharisma(entity.getCharisma().isProeficiency());
		
		
		
		result.setLevel(entity.getChallengeLevel().getId());
		return result;
	}
}
