package com.shakal.rpg.api.mappers;

import java.util.stream.Collectors;

import com.shakal.rpg.api.dto.info.FloorInfoDTO;
import com.shakal.rpg.api.model.place.Floor;

public class FloorMapper {

	public static FloorInfoDTO floorEntityToDto(Floor entity) {
		FloorInfoDTO dto = new FloorInfoDTO();
		dto.setId(entity.getId());
		dto.setMap(entity.getMap());
		dto.setWalls(entity.getWalls().stream()
				.map( wall -> PlaceWallsMapper.entityToDTO(wall) )
				.collect(Collectors.toList()));
		//dto.setWallsImage(entity.getWallsImage());
		dto.setNaturalHeight(entity.getNaturalHeight());
		dto.setNaturalWidth(entity.getNaturalWidth());
		dto.setSquareDimension(entity.getSquareDimension());
		dto.setSquareSizeCm(entity.getSquareSizeCm());
		return dto;
	}
}
