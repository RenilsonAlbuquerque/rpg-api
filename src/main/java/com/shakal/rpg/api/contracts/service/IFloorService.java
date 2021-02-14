package com.shakal.rpg.api.contracts.service;

import java.util.List;

import com.shakal.rpg.api.dto.create.FloorCreateDTO;
import com.shakal.rpg.api.dto.info.FloorInfoDTO;
import com.shakal.rpg.api.dto.map.MapWallsDTO;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.model.place.Floor;
import com.shakal.rpg.api.model.place.Place;

public interface IFloorService {

	FloorInfoDTO getFloorById(long id) throws ResourceNotFoundException;
	Floor createFloor(FloorCreateDTO floorCreateDto,Place place,Long floorOrder) throws ResourceNotFoundException,FileManagementException;
	boolean updateFloorWallsImage(long placeId,List<MapWallsDTO> inputDto) throws ResourceNotFoundException,FileManagementException;
}
