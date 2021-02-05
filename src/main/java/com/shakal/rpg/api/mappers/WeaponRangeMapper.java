package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.model.equipament.weapon.WeaponRange;

public class WeaponRangeMapper {
	
	public static KeyValueDTO entityToDTO(WeaponRange entity) {
		KeyValueDTO result = new KeyValueDTO();
		result.setId(entity.getId());
		result.setValue(entity.getName());
		return result;
	}

}
