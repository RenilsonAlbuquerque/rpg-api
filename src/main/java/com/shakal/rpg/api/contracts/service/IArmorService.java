package com.shakal.rpg.api.contracts.service;

import com.shakal.rpg.api.dto.create.ArmorCreateDTO;
import com.shakal.rpg.api.dto.info.ArmorInfoDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface IArmorService {

	ArmorCreateDTO createArmor(ArmorCreateDTO armorCreate) throws ResourceNotFoundException;
	ArmorInfoDTO getArmorInfoById(Long armorId)throws ResourceNotFoundException;
}
