package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.info.ToolInfoDTO;
import com.shakal.rpg.api.model.equipament.tool.Tool;
import com.shakal.rpg.api.dto.commons.KeyValueDTO;

public abstract class ToolMapper {

	public static ToolInfoDTO entityToInfo(Tool entity) {
		ToolInfoDTO result = new ToolInfoDTO();
		result.setId(entity.getId());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		result.setCategory(new KeyValueDTO(entity.getCategory().getId(),entity.getCategory().getName()));
		result.setWeight(entity.getWeight());
		result.setImagePath(entity.getImagePath());
		result.setCost(EconomyMapper.costEntityToInfo(entity.getPrice()));
		result.setRarity(RarityMapper.entityToDTO(entity.getRarity()));
		return result;
	}
}
