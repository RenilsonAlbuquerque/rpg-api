package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.model.weapon.WeaponProperty;

public class WeaponPropertyMapper {

	public static KeyValueDTO entityToDTO(WeaponProperty entity) {
		KeyValueDTO result = new KeyValueDTO();
		result.setId(entity.getId());
		result.setValue(entity.getName());
		return result;
	}
}
