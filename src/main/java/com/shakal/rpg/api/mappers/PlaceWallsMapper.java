package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.map.MapWallsDTO;
import com.shakal.rpg.api.model.place.Floor;
import com.shakal.rpg.api.model.place.FloorWall;

public class PlaceWallsMapper {

	public static MapWallsDTO entityToDTO(FloorWall entity) {
		MapWallsDTO result = new MapWallsDTO();
		result.setStartPositionX(entity.getStartPositionX());
		result.setStartPositionY(entity.getStartPositionY());
		result.setEndPositionX(entity.getEndPositionX());
		result.setEndPositionY(entity.getEndPositionY());
		return result;
	}
	public static FloorWall dtoToEntity(MapWallsDTO entity,Floor floor) {
		FloorWall result = new FloorWall();
		result.setStartPositionX(entity.getStartPositionX());
		result.setStartPositionY(entity.getStartPositionY());
		result.setEndPositionX(entity.getEndPositionX());
		result.setEndPositionY(entity.getEndPositionY());
		result.setFloor(floor);
		return result;
	}
}
