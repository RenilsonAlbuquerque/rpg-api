package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.overview.EquipmentOverviewDTO;
import com.shakal.rpg.api.model.enums.EquipmentTypeEnum;
import com.shakal.rpg.api.model.equipament.Equipament;

public class EquipmentMapper {

	public static KeyValueDTO enumToDTO(EquipmentTypeEnum equipment) {
		KeyValueDTO result = new KeyValueDTO();
		result.setId(equipment.getValue());
		if(equipment.getValue() == EquipmentTypeEnum.ARMOR.getValue()) {
			result.setValue("Armadura");
		}
		if(equipment.getValue() == EquipmentTypeEnum.WEAPON.getValue()) {
			result.setValue("Arma");
		}
		if(equipment.getValue() == EquipmentTypeEnum.TOOL.getValue()) {
			result.setValue("Ferramenta");
		}
		if(equipment.getValue() == EquipmentTypeEnum.MOUNT.getValue()) {
			result.setValue("Montaria");
		}
		return result;
		
		
	}
	public static EquipmentOverviewDTO entityToOverview(Equipament entity) {
		EquipmentOverviewDTO result = new EquipmentOverviewDTO();
		result.setId( entity.getId().intValue());
		result.setName(entity.getName());
		result.setWeight(entity.getWeight());
		result.setCost(entity.getPrice().getQuantity() + entity.getPrice().getCoin().getAbreviation());
		return result;
	}
}
