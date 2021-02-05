package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.overview.EquipmentBagOverviewDTO;
import com.shakal.rpg.api.dto.overview.EquipmentOverviewDTO;
import com.shakal.rpg.api.model.character.BagEquipment;
import com.shakal.rpg.api.model.enums.EquipmentTypeEnum;
import com.shakal.rpg.api.model.equipament.Equipament;
import com.shakal.rpg.api.model.equipament.adventuregear.AdventureGear;
import com.shakal.rpg.api.model.equipament.armor.Armor;
import com.shakal.rpg.api.model.equipament.weapon.Weapon;

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
		result.setEquipmentCategory(mapInstanceOfEquipment(entity));
		return result;
	}
	public static EquipmentBagOverviewDTO mapBagEntityToDTO(BagEquipment entity) {
		EquipmentBagOverviewDTO result = new EquipmentBagOverviewDTO();
		result.setId(entity.getEquipment().getId());
		result.setName(entity.getEquipment().getName());
		result.setQuantity(entity.getQuantity());
		result.setWeight(entity.getEquipment().getWeight());
		result.setEquipmentCategory(mapInstanceOfEquipment(entity.getEquipment()));
		return result;
	}
	private static KeyValueDTO mapInstanceOfEquipment(Equipament entity) {
		KeyValueDTO result = new KeyValueDTO();
		if(entity instanceof Weapon) {
			result.setId(EquipmentTypeEnum.WEAPON.getValue());
			result.setValue("Arma");
		}
		if(entity instanceof Armor) {
			result.setId(EquipmentTypeEnum.ARMOR.getValue());
			result.setValue("Armadura");
		}
		if(entity instanceof AdventureGear) {
			result.setId(EquipmentTypeEnum.TOOL.getValue());
			result.setValue("Ferramenta");
		}
		return result;
	}
}
