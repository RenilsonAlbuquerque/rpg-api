package com.shakal.rpg.api.mappers;

import com.shakal.rpg.api.dto.overview.PlaceOverviewDTO;
import com.shakal.rpg.api.model.place.Place;

public class PlaceMapper {
	public static PlaceOverviewDTO entityToOverview(Place entity) {
		PlaceOverviewDTO result = new PlaceOverviewDTO();
		result.setId(entity.getId());
		result.setName(entity.getName());
		result.setFolderImage(entity.getImage());
		//result.setFolderImage(FileHelper.convertImageToBase64Mini(Constants.MAPS_IMAGES_PATH +entity.getMap()));
		return result;
	}
}
