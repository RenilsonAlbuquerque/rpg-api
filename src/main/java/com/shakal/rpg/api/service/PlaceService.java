package com.shakal.rpg.api.service;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shakal.rpg.api.contracts.service.IFloorService;
import com.shakal.rpg.api.contracts.service.IPlaceService;
import com.shakal.rpg.api.dto.commons.NumberNumberDTO;
import com.shakal.rpg.api.dto.create.FloorCreateDTO;
import com.shakal.rpg.api.dto.create.PlaceCreateDTO;

import com.shakal.rpg.api.dto.info.PlaceInfoDTO;
import com.shakal.rpg.api.dto.overview.PlaceOverviewDTO;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

import com.shakal.rpg.api.filedata.service.ExternalMapImageService;
import com.shakal.rpg.api.mappers.PlaceMapper;
import com.shakal.rpg.api.mappers.StoryMapper;
import com.shakal.rpg.api.model.Story;
import com.shakal.rpg.api.model.place.Floor;
import com.shakal.rpg.api.model.place.Place;
import com.shakal.rpg.api.repository.PlaceDAO;
import com.shakal.rpg.api.repository.FloorWallDAO;
import com.shakal.rpg.api.repository.StoryDAO;
import com.shakal.rpg.api.utils.Messages;


@Service
public class PlaceService implements IPlaceService{

	private PlaceDAO placeDao;
	private StoryDAO storyDao;
	private FloorWallDAO placeWallDAO;
	private ExternalMapImageService externalMapImageService;
	private IFloorService floorService;
	
	
	@Autowired
	public PlaceService(PlaceDAO placeDao, StoryDAO storyDao,FloorWallDAO placeWallDAO,
			ExternalMapImageService externalMapImageService,IFloorService floorService
			) {
		this.placeDao = placeDao;
		this.storyDao = storyDao;
		this.placeWallDAO = placeWallDAO;
		this.externalMapImageService = externalMapImageService;
		this.floorService = floorService;
	}
	
	@Override
	public PlaceInfoDTO getPlaceById(long id) throws ResourceNotFoundException {
		Place place = this.placeDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		
		return StoryMapper.placeEntityToDto(place);
	}

	@Override
	public List<PlaceOverviewDTO> getPlacesListByStoryId(long id) throws ResourceNotFoundException {
		
		return this.placeDao.retrieveAllPlacesInStory(id).stream()
		.map( place -> PlaceMapper.entityToOverview(place))
        .collect(Collectors.toList());
        /*
		for(Place pl : this.placeDao.retrieveAllPlacesInStory(id)) {
			added = PlaceMapper.entityToOverview(pl);
			added.setFolderImage(this.externalMapImageService.retrieveMinimap(pl.getMap()));
			result.add(added);
		}
		return result;
		*/
	}
	@Transactional
	@Override
	public PlaceOverviewDTO createPlace(PlaceCreateDTO placeCreate) throws ResourceNotFoundException,FileManagementException{
		
		Story story = this.storyDao.findById(placeCreate.getStoryId())
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		Place entity = new Place();
		entity.setName(placeCreate.getName());
		entity.setBackground(placeCreate.getBackground());
		entity.setImage(placeCreate.getImage());
		
		entity.setStory(story);
		entity = this.placeDao.save(entity);
		for(int i = 0; i< placeCreate.getFloors().size();i++) {
			this.floorService.createFloor(placeCreate.getFloors().get(i), entity,Long.valueOf(i));
		}
		return PlaceMapper.entityToOverview(entity);
	}

	@Override
	public Boolean removePlace(long placeId) throws ResourceNotFoundException {
		Place place = this.placeDao.findById(placeId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		place.setDeleted(true);
		this.placeDao.save(place);
		return true;
		
	}

	@Override
	public List<NumberNumberDTO> getFloorsByPlaceId(long placeId) throws ResourceNotFoundException {
		Place place = this.placeDao.findById(placeId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		
		return place.getFloors().stream()
				.map(floor ->  new NumberNumberDTO(floor.getFloorOrder(),floor.getId()))
				 .collect(Collectors.toList());
		/*
		return place.getFloors().stream()
			.collect(Collectors.toMap(Floor::getFloorOrder, Floor:: getId));
			*/
	}

	@Override
	public Long getDefaultFloorIdByPlaceId(long placeId) throws ResourceNotFoundException {
		Place place = this.placeDao.findById(placeId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		
		return place.getFloors().get(0).getId();
	}

	
	


}
