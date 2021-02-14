package com.shakal.rpg.api.service;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.IFloorService;
import com.shakal.rpg.api.dto.create.FloorCreateDTO;
import com.shakal.rpg.api.dto.info.FloorInfoDTO;
import com.shakal.rpg.api.dto.map.MapWallsDTO;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.filedata.service.ExternalMapImageService;
import com.shakal.rpg.api.helpers.FileHelper;
import com.shakal.rpg.api.mappers.FloorMapper;
import com.shakal.rpg.api.mappers.PlaceWallsMapper;
import com.shakal.rpg.api.model.place.Floor;
import com.shakal.rpg.api.model.place.Place;
import com.shakal.rpg.api.repository.FloorDAO;
import com.shakal.rpg.api.repository.FloorWallDAO;
import com.shakal.rpg.api.utils.Messages;

@Service
public class FloorService implements IFloorService{

	private FloorDAO floorDao;
	private FloorWallDAO placeWallDAO;
	private ExternalMapImageService externalMapImageService;
	
	@Autowired
	public FloorService(FloorDAO floorDao,
			FloorWallDAO placeWallDAO,
			ExternalMapImageService externalMapImageService) {
		this.floorDao = floorDao;
		this.placeWallDAO = placeWallDAO;
		this.externalMapImageService = externalMapImageService;
	}
	
	@Override
	public FloorInfoDTO getFloorById(long id) throws ResourceNotFoundException {
		Floor floor = this.floorDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.STORY_NOT_FOUND));
		
		floor.setMap(this.externalMapImageService.retrieveFileById(floor.getMap()));
		
		return FloorMapper.floorEntityToDto(floor);
	}
	
	@Override
	public Floor createFloor(FloorCreateDTO floorCreateDto,Place place,Long floorOrder) throws ResourceNotFoundException,FileManagementException{
		
	
		Floor entity = new Floor();
		
		entity.setMap("");
		
		entity.setSquareDimension(floorCreateDto.getSquareDimension());
		entity.setSquareSizeCm(floorCreateDto.getSquareDimensionCm());
		entity.setNaturalHeight(200.0d);
		entity.setFloorOrder(floorOrder);

		
		entity.setPlace(place);
		entity = this.floorDao.save(entity);
		
		String fileName = "map" + entity.getId()+ ".jpg";
		Dimension dimension = new Dimension();
		String fileIdentifier = null;
		
		try {
			File fileToUp = FileHelper.base64ToFile(floorCreateDto.getMap());
			fileIdentifier = externalMapImageService.saveMapImageFile(fileToUp, fileName);
			dimension = FileHelper.getDimensionsOfImage(fileToUp);
			
		} catch (IOException e) {
			throw new FileManagementException("Erro ao salvar o arquivo");
		}
		entity.setMap(fileIdentifier);
		entity.setNaturalHeight(dimension.getHeight());
		entity.setNaturalWidth(dimension.getWidth());
		entity = this.floorDao.save(entity);
		return entity;
	}
	
	@Transactional
	@Override
	public boolean updateFloorWallsImage(long floorId,List<MapWallsDTO> inputDto) throws ResourceNotFoundException,FileManagementException {
		Floor floor = this.floorDao.findById(floorId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.PLACE_NOT_FOUND));
		
		this.placeWallDAO.deletePlacesWallsByFloorId(floorId);
		
		for(MapWallsDTO wall: inputDto) {
			this.placeWallDAO.save( PlaceWallsMapper.dtoToEntity(wall,floor));
		}
		return true;
	}
}
