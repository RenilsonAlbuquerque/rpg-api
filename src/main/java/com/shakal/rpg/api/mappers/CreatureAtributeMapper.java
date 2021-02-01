package com.shakal.rpg.api.mappers;

import java.util.List;

import com.shakal.rpg.api.dto.info.CharacterSheetDTO;
import com.shakal.rpg.api.helpers.AtributeHelper;
import com.shakal.rpg.api.model.relation.CreatureAtribute;

public class CreatureAtributeMapper {

	public static List<CreatureAtribute> mapAtributesDtoToEntity(List<CreatureAtribute> atributes,CharacterSheetDTO characterInputDto){
		for(CreatureAtribute atribute:atributes) {
			if(atribute.getId().getAtributeId() ==  characterInputDto.getStrength().getId()) {
				atribute.setValue(characterInputDto.getStrength().getValue());
				atribute.setModfier(AtributeHelper.calculateAtributeBonus(characterInputDto.getStrength().getValue()));
				atribute.setProeficiency(characterInputDto.getStrength().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getDexterity().getId()) {
				atribute.setValue(characterInputDto.getDexterity().getValue());
				atribute.setModfier(AtributeHelper.calculateAtributeBonus(characterInputDto.getDexterity().getValue()));
				atribute.setProeficiency(characterInputDto.getDexterity().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getConstitution().getId()) {
				atribute.setValue(characterInputDto.getConstitution().getValue());
				atribute.setModfier(AtributeHelper.calculateAtributeBonus(characterInputDto.getConstitution().getValue()));
				atribute.setProeficiency(characterInputDto.getConstitution().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getInteligence().getId()) {
				atribute.setValue(characterInputDto.getInteligence().getValue());
				atribute.setModfier(AtributeHelper.calculateAtributeBonus(characterInputDto.getInteligence().getValue()));
				atribute.setProeficiency(characterInputDto.getInteligence().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getWisdom().getId()) {
				atribute.setValue(characterInputDto.getWisdom().getValue());
				atribute.setModfier(AtributeHelper.calculateAtributeBonus(characterInputDto.getWisdom().getValue()));
				atribute.setProeficiency(characterInputDto.getWisdom().isProeficiency());
			}
			if(atribute.getId().getAtributeId() ==  characterInputDto.getCharisma().getId()) {
				atribute.setValue(characterInputDto.getCharisma().getValue());
				atribute.setModfier(AtributeHelper.calculateAtributeBonus(characterInputDto.getCharisma().getValue()));
				atribute.setProeficiency(characterInputDto.getCharisma().isProeficiency());
			}
		}
		return atributes;
	}
}
