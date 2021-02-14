package com.shakal.rpg.api.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.IFloorMarkService;
import com.shakal.rpg.api.dto.create.PlaceMarkCreateDTO;
import com.shakal.rpg.api.dto.info.PlaceMarkInfo;
import com.shakal.rpg.api.dto.overview.PlaceMarkOverviewDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.PlaceMarkMapper;
import com.shakal.rpg.api.model.place.Floor;
import com.shakal.rpg.api.model.place.FloorMark;
import com.shakal.rpg.api.repository.FloorDAO;
import com.shakal.rpg.api.repository.FloorMarkDAO;
import com.shakal.rpg.api.utils.Messages;

@Service
public class FloorMarkService implements IFloorMarkService {
	
	
	private FloorMarkDAO placeMarkDao;
	private FloorDAO floorDao;
	
	@Autowired
	public FloorMarkService(FloorMarkDAO placeMarkDao,FloorDAO floorDao) {
		this.placeMarkDao = placeMarkDao;
		this.floorDao = floorDao;
	}

	@Override
	public PlaceMarkInfo getPlaceMarkInfoById(long id) throws ResourceNotFoundException {
		FloorMark placeMark = this.placeMarkDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		return PlaceMarkMapper.entityToInfo(placeMark);
		
		
	}

	@Override
	public List<PlaceMarkOverviewDTO> getAllPlaceMarksOfPlace(long floorId) throws ResourceNotFoundException {
		Floor floor = this.floorDao.findById(floorId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.PLACE_NOT_FOUND));
		return floor.getMarks()
		.stream()
		.map(mark -> PlaceMarkMapper.entityToOverview(mark))
        .collect(Collectors.toList());
	}

	@Override
	public PlaceMarkCreateDTO createFloorMark(PlaceMarkCreateDTO placeMarkCreateDTO) throws ResourceNotFoundException {
		Floor floor = this.floorDao.findById(placeMarkCreateDTO.getPlaceId())
				.orElseThrow(() -> new ResourceNotFoundException(Messages.PLACE_NOT_FOUND));
		FloorMark entity = new FloorMark();
		entity.setName(placeMarkCreateDTO.getName());
		entity.setDescription(placeMarkCreateDTO.getDescription());
		entity.setCoordinateX(placeMarkCreateDTO.getCoordinateX());
		entity.setCoordinateY(placeMarkCreateDTO.getCoordinateY());
		entity.setFloor(floor);
		this.placeMarkDao.save(entity);
		return placeMarkCreateDTO;
	}
	
	

}
