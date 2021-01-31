package com.shakal.rpg.api.mappers;

import java.util.List;

import com.shakal.rpg.api.dto.info.CharacterSheetDTO;
import com.shakal.rpg.api.model.relation.CreatureAtribute;

public class CreatureAtributeMapper {

	public static List<CreatureAtribute> mapAtributesDtoToEntity(List<CreatureAtribute> atributes,CharacterSheetDTO characterInputDto){
		for(CreatureAtribute atribute:atributes) {
			if(atribute.getId().getAtributeId() ==  characterInputDto.getStrength().getId()) {
				atribute.setValue(characterInputDto.getStrength().getValue());
				atribute.setModfier(characterInputDto.getStrength().getModfier());
				atribute.setProeficiency(characterInputDto.getStrength().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getDexterity().getId()) {
				atribute.setValue(characterInputDto.getDexterity().getValue());
				atribute.setModfier(characterInputDto.getDexterity().getModfier());
				atribute.setProeficiency(characterInputDto.getDexterity().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getConstitution().getId()) {
				atribute.setValue(characterInputDto.getConstitution().getValue());
				atribute.setModfier(characterInputDto.getConstitution().getModfier());
				atribute.setProeficiency(characterInputDto.getConstitution().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getInteligence().getId()) {
				atribute.setValue(characterInputDto.getInteligence().getValue());
				atribute.setModfier(characterInputDto.getInteligence().getModfier());
				atribute.setProeficiency(characterInputDto.getInteligence().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getWisdom().getId()) {
				atribute.setValue(characterInputDto.getWisdom().getValue());
				atribute.setModfier(characterInputDto.getWisdom().getModfier());
				atribute.setProeficiency(characterInputDto.getWisdom().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getCharisma().getId()) {
				atribute.setValue(characterInputDto.getCharisma().getValue());
				atribute.setModfier(characterInputDto.getCharisma().getModfier());
				atribute.setProeficiency(characterInputDto.getCharisma().isProeficiency());
			}
		}
		return atributes;
	}
}
