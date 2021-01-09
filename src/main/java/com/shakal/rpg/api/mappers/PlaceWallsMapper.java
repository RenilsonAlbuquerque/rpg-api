package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.map.MapWallsDTO;
import com.shakal.rpg.api.model.Place;
import com.shakal.rpg.api.model.place.PlaceWall;

public class PlaceWallsMapper {

	public static MapWallsDTO entityToDTO(PlaceWall entity) {
		MapWallsDTO result = new MapWallsDTO();
		result.setStartPositionX(entity.getStartPositionX());
		result.setStartPositionY(entity.getStartPositionY());
		result.setEndPositionX(entity.getEndPositionX());
		result.setEndPositionY(entity.getEndPositionY());
		return result;
	}
	public static PlaceWall dtoToEntity(MapWallsDTO entity,Place place) {
		PlaceWall result = new PlaceWall();
		result.setStartPositionX(entity.getStartPositionX());
		result.setStartPositionY(entity.getStartPositionY());
		result.setEndPositionX(entity.getEndPositionX());
		result.setEndPositionY(entity.getEndPositionY());
		result.setPlace(place);
		return result;
	}
}
