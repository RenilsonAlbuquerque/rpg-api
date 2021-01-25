package com.shakal.rpg.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.ICreatureService;
import com.shakal.rpg.api.dto.info.CreatureTokenDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.filedata.service.ExternalCreatureProfileImageService;
import com.shakal.rpg.api.model.Creature;
import com.shakal.rpg.api.repository.CreatureDAO;
import com.shakal.rpg.api.repository.ImageTokenDAO;
import com.shakal.rpg.api.utils.Messages;

@Service
public class CreatureService implements ICreatureService {
	
	private ImageTokenDAO imageTokenDAO;
	private CreatureDAO creatureDao;
	private ExternalCreatureProfileImageService externalProfileImageService;
	
	@Autowired
	public CreatureService(ImageTokenDAO imageTokenDAO,ExternalCreatureProfileImageService externalProfileImageService,
			CreatureDAO creatureDao) {
		this.imageTokenDAO = imageTokenDAO;
		this.externalProfileImageService = externalProfileImageService;
		this.creatureDao = creatureDao;
		
	}

	@Override
	public CreatureTokenDTO getCreatureToken(long id) throws ResourceNotFoundException {
		/*
		ImageToken search = this.imageTokenDAO.retrieveCharacterTokenById(id)
					.orElseThrow(() -> new ResourceNotFoundException(Messages.CHARACTER_NOT_FOUND));
					/*
		/*
		if(search.getImagePath() == null || search.getImagePath().trim().length()  0 ) {
			CreatureTokenDTO result = new CreatureTokenDTO();
			result.setId(id);
			//result.setPicture(search.getCreature().getImagePath());
			result.setPicture(externalProfileImageService.retrieveFileById());
			return result;
		}else {
			return CreatureTokenMapper.mapEntityToDTO(search);
		}
		*/
		
		Creature search = this.creatureDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.CHARACTER_NOT_FOUND));
		
		CreatureTokenDTO result = new CreatureTokenDTO();
		result.setId(id);
		//result.setPicture(search.getCreature().getImagePath());
		//result.setPicture(externalProfileImageService.retrieveFileById("creature89.jpg"));
		result.setPicture(this.externalProfileImageService.retrieveFileById(search.getImagePath()));
		return result;
				
		
	}

}
