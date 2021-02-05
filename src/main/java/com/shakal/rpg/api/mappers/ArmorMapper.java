package com.shakal.rpg.api.mappers;

import java.util.stream.Collectors;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.info.ArmorInfoDTO;
import com.shakal.rpg.api.dto.info.WeaponInfoDTO;
import com.shakal.rpg.api.model.equipament.armor.Armor;
import com.shakal.rpg.api.model.equipament.armor.ArmorCategory;

public class ArmorMapper {
	/*
	public static KeyValueDTO entityToDTO(Armor entity) {
		KeyValueDTO result = new KeyValueDTO();
		result.setId(entity.getId());
		result.setValue(entity.getName());
		return result;
	}
	*/
	public static KeyValueDTO categoryEntityToDTO(ArmorCategory entity) {
		KeyValueDTO result = new KeyValueDTO();
		result.setId(entity.getId());
		result.setValue(entity.getName());
		return result;
	}
	public static ArmorInfoDTO entityToInfoDTO(Armor entity) {
		ArmorInfoDTO result = new ArmorInfoDTO();
		result.setId(entity.getId());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		result.setWeight(entity.getWeight());
		result.setImagePath(entity.getImagePath());
		result.setCost(EconomyMapper.costEntityToInfo(entity.getPrice()));
		result.setRarity(RarityMapper.entityToDTO(entity.getRarity()));
		

		result.setCategory(new KeyValueDTO(entity.getCategory().getId(),entity.getCategory().getName()));
		//result.setArmorClass("12");
		
		result.setArmorClass(entity.getArmorClass().getArmorClassBase() + " " 
				+ ((entity.getArmorClass().getAtribute() != null) ? entity.getArmorClass().getAtribute().getValue() : "") + " " 
				+ entity.getArmorClass().getMaxValue());
		
		result.setMinStrength("Força" + entity.getMinStrength());
		result.setBonus(entity.getAcBonus());
		return result;
	}

}
