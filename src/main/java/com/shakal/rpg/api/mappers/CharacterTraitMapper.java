package com.shakal.rpg.api.mappers;


import com.shakal.rpg.api.dto.info.CharcterTraitDTO;
import com.shakal.rpg.api.model.character.CharacterTrait;
import com.shakal.rpg.api.model.character.Character;

public class CharacterTraitMapper {

	public static CharcterTraitDTO entityToDTO(CharacterTrait entity) {
		CharcterTraitDTO result = new CharcterTraitDTO();
		result.setId(entity.getId());
		result.setPersonality(entity.getPersonality());
		result.setIdeals(entity.getIdeals());
		result.setBonds(entity.getBonds());
		result.setFlaws(entity.getFlaws());
		result.setFeaturesFeatsEquipmentsNotes(entity.getFeaturesFeatsEquipmentsNotes());
		return result;
	}
	public static CharcterTraitDTO createEmptyDto() {
		CharcterTraitDTO result = new CharcterTraitDTO();
		result.setId(0);
		result.setPersonality("");
		result.setIdeals("");
		result.setBonds("");
		result.setFlaws("");
		result.setFeaturesFeatsEquipmentsNotes("");
		return result;
	}
	public static CharacterTrait dtoToEntity(CharcterTraitDTO inputDto,Character character) {
		CharacterTrait result = new CharacterTrait();
		result.setId(character.getId());
		result.setId(inputDto.getId());
		result.setPersonality(inputDto.getPersonality());
		result.setIdeals(inputDto.getIdeals());
		result.setBonds(inputDto.getBonds());
		result.setFlaws(inputDto.getFlaws());
		result.setFeaturesFeatsEquipmentsNotes(inputDto.getFeaturesFeatsEquipmentsNotes());
		result.setCharacter(character);
		return result;
	}
}
