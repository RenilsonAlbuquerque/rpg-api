package com.shakal.rpg.api.service;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.filemanage.IExternalImageRepository;
import com.shakal.rpg.api.contracts.filemanage.IExternalWallsMapRepository;
import com.shakal.rpg.api.contracts.service.IPlaceService;
import com.shakal.rpg.api.dto.create.CreateMapWallsImageDTO;
import com.shakal.rpg.api.dto.create.PlaceCreateDTO;

import com.shakal.rpg.api.dto.info.PlaceInfoDTO;
import com.shakal.rpg.api.dto.map.MapWallsDTO;
import com.shakal.rpg.api.dto.overview.PlaceOverviewDTO;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.filedata.GoogleDriveMapWallsService;
import com.shakal.rpg.api.filedata.GoogleDriveService;
import com.shakal.rpg.api.filedata.LocalStorageMapWallsService;
import com.shakal.rpg.api.filedata.LocalStorageMapService;
import com.shakal.rpg.api.helpers.FileHelper;
import com.shakal.rpg.api.mappers.MonsterMapper;
import com.shakal.rpg.api.mappers.PlaceMapper;
import com.shakal.rpg.api.mappers.PlaceWallsMapper;
import com.shakal.rpg.api.mappers.StoryMapper;

import com.shakal.rpg.api.model.Place;
import com.shakal.rpg.api.model.Story;
import com.shakal.rpg.api.repository.PlaceDAO;
import com.shakal.rpg.api.repository.PlaceWallDAO;
import com.shakal.rpg.api.repository.StoryDAO;
import com.shakal.rpg.api.utils.Messages;


@Service
public class PlaceService implements IPlaceService{

	private PlaceDAO placeDao;
	private StoryDAO storyDao;
	private IExternalImageRepository externalImageRepository;
	private PlaceWallDAO placeWallDAO;
	//private IExternalWallsMapRepository externalImageWallsRepository;
	
	@Autowired
	public PlaceService(PlaceDAO placeDao, StoryDAO storyDao,PlaceWallDAO placeWallDAO,
			//GoogleDriveService mapsStorageService
			//GoogleDriveMapWallsService wallsMapRepository
			LocalStorageMapService mapsStorageService
			//LocalStorageMapWallsService wallsMapRepository
			) {
		this.placeDao = placeDao;
		this.storyDao = storyDao;
		this.placeWallDAO = placeWallDAO;
		this.externalImageRepository = mapsStorageService;
		//this.externalImageWallsRepository = wallsMapRepository;
	}
	
	@Override
	public PlaceInfoDTO getPlaceById(long id) throws ResourceNotFoundException {
		Place place = this.placeDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		
		place.setMap(this.externalImageRepository.retrieveFileById(place.getMap()));
		/*
		if(place.getWallsImage() != null && !place.getWallsImage().isEmpty()) {
			place.setWallsImage(this.externalImageWallsRepository.retrieveWallImageFileById(place.getWallsImage()));
		}else {
			place.setWallsImage("");
		}
		*/
		return StoryMapper.placeEntityToDto(place);
	}

	@Override
	public List<PlaceOverviewDTO> getPlacesListByStoryId(long id) throws ResourceNotFoundException {
		
		List<PlaceOverviewDTO> result = new ArrayList<PlaceOverviewDTO>();
		PlaceOverviewDTO added = null;
		for(Place pl : placeDao.findAll()) {
			added = PlaceMapper.entityToOverview(pl);
			added.setFolderImage(this.externalImageRepository.retrieveMinimap(pl.getMap()));
			result.add(added);
		}
		return result;
	}

	@Override
	public PlaceOverviewDTO createPlace(PlaceCreateDTO placeCreate) throws ResourceNotFoundException,FileManagementException{
		
		Story story = this.storyDao.findById(placeCreate.getStoryId())
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		Place entity = new Place();
		entity.setName(placeCreate.getName());
		entity.setBackground(placeCreate.getBackground());
		entity.setMap("");
		entity.setxDimension(placeCreate.getxDimension());
		entity.setyDimension(placeCreate.getyDimension());
		entity.setSquareDimension(placeCreate.getSquareDimension());
		entity.setNaturalHeight(200.0d);
		entity.setSquareSizeCm(placeCreate.getSquareSizeCm());
		entity.setStory(story);
		//entity.setWallsImage("");
		entity = this.placeDao.save(entity);
		
		String fileName = "map" + entity.getId()+ ".jpg";
		Dimension dimension = new Dimension();
		String fileIdentifier = null;
		
		try {
			File fileToUp = FileHelper.base64ToFile(placeCreate.getMap());
			fileIdentifier = externalImageRepository.saveMapImageFile(fileToUp, fileName);
			dimension = FileHelper.getDimensionsOfImage(fileToUp);
			
		} catch (IOException e) {
			throw new FileManagementException("Erro ao salvar o arquivo");
		}
		entity.setMap(fileIdentifier);
		entity.setNaturalHeight(dimension.getHeight());
		entity.setNaturalWidth(dimension.getWidth());
		entity = this.placeDao.save(entity);
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
	public boolean updatePlaceWallsImage(long placeId,List<MapWallsDTO> inputDto) throws ResourceNotFoundException,FileManagementException {
		Place place = this.placeDao.findById(placeId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.PLACE_NOT_FOUND));
		
		//place.getWalls().clear();
		
		this.placeWallDAO.deletePlacesWallsByPlaceId(placeId);
		
		for(MapWallsDTO wall: inputDto) {
			this.placeWallDAO.save( PlaceWallsMapper.dtoToEntity(wall,place));
		}
		/*
		place.setWalls( inputDto.stream()
				.map( wall -> PlaceWallsMapper.dtoToEntity(wall,place) )
				.collect(Collectors.toList())
		);
		this.placeDao.save(place);
		*/
		
		//String fileName = "wallsPlace" + inputDto.getPlaceId() + ".png";
		/*
		File fileToUp;
		try {
			fileToUp = FileHelper.base64ToFile(inputDto.getWallsImageBase64());
			place.setWallsImage(this.externalImageWallsRepository.saveWallsMapFile(fileToUp, fileName));
			this.placeDao.save(place);
		} catch (IOException  e) {
			throw new FileManagementException("Erro ao salvar o arquivo"); 
		}
		*/
		return true;
	}
	


}
