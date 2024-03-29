package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.info.PlaceMarkInfo;
import com.shakal.rpg.api.dto.overview.PlaceMarkOverviewDTO;
import com.shakal.rpg.api.model.place.FloorMark;

public class PlaceMarkMapper {

	public static PlaceMarkInfo entityToInfo(FloorMark entity) {
		PlaceMarkInfo result = new PlaceMarkInfo();
		result.setId(entity.getId());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		return result;
		
	}
	public static PlaceMarkOverviewDTO entityToOverview(FloorMark entity) {
		PlaceMarkOverviewDTO result = new PlaceMarkOverviewDTO();
		result.setId(entity.getId());
		result.setName(entity.getName());
		result.setCoordinateX(entity.getCoordinateX());
		result.setCoordinateY(entity.getCoordinateY());
		return result;
	}
}
