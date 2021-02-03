package com.shakal.rpg.api.contracts.service;


import com.shakal.rpg.api.dto.create.EquipmentCreateInputDTO;
import com.shakal.rpg.api.dto.filter.CustomPage;
import com.shakal.rpg.api.dto.filter.PaginationFilter;
import com.shakal.rpg.api.dto.overview.EquipmentOverviewDTO;

public interface IEquipmentService {

	EquipmentCreateInputDTO getEquipmentCreateInput();
	CustomPage<EquipmentOverviewDTO> getEquipmentPaged(PaginationFilter filter);
}
