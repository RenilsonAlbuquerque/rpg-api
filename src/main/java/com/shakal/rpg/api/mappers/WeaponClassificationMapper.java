package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.model.weapon.WeaponClassification;

public class WeaponClassificationMapper {
	
	public static KeyValueDTO entityToDTO(WeaponClassification entity) {
		KeyValueDTO result = new KeyValueDTO();
		result.setId(entity.getId());
		result.setValue(entity.getName());
		return result;
	}

}
