package com.shakal.rpg.api.contracts.service;

import java.util.List;

import com.shakal.rpg.api.dto.commons.NumberNumberDTO;
import com.shakal.rpg.api.dto.create.PlaceCreateDTO;
import com.shakal.rpg.api.dto.info.PlaceInfoDTO;
import com.shakal.rpg.api.dto.overview.PlaceOverviewDTO;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface IPlaceService {

	PlaceInfoDTO getPlaceById(long id) throws ResourceNotFoundException;
	List<PlaceOverviewDTO> getPlacesListByStoryId(long id) throws ResourceNotFoundException;
	PlaceOverviewDTO createPlace(PlaceCreateDTO placeCreate) throws ResourceNotFoundException, FileManagementException;
	Boolean removePlace(long placeId) throws ResourceNotFoundException;
	List<NumberNumberDTO> getFloorsByPlaceId(long placeId)throws ResourceNotFoundException;
	Long getDefaultFloorIdByPlaceId(long placeId)throws ResourceNotFoundException;
}
