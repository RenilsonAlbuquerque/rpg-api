package com.shakal.rpg.api.contracts.service;

import java.util.List;

import com.shakal.rpg.api.dto.create.PlaceMarkCreateDTO;
import com.shakal.rpg.api.dto.info.PlaceMarkInfo;
import com.shakal.rpg.api.dto.overview.PlaceMarkOverviewDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface IFloorMarkService {

	PlaceMarkInfo getPlaceMarkInfoById(long id) throws ResourceNotFoundException;
	List<PlaceMarkOverviewDTO> getAllPlaceMarksOfPlace(long placeId) throws ResourceNotFoundException;
	PlaceMarkCreateDTO createFloorMark(PlaceMarkCreateDTO placeMarkCreateDTO) throws ResourceNotFoundException;
}
