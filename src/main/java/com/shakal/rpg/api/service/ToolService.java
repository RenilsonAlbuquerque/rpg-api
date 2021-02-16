package com.shakal.rpg.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.IToolService;
import com.shakal.rpg.api.dto.info.ToolInfoDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.ToolMapper;
import com.shakal.rpg.api.model.equipament.tool.Tool;
import com.shakal.rpg.api.repository.ToolDAO;
import com.shakal.rpg.api.utils.Messages;

@Service
public class ToolService implements IToolService{

	private ToolDAO toolDao;
	
	@Autowired
	public ToolService(ToolDAO toolDao) {
		this.toolDao = toolDao;
	}

	@Override
	public ToolInfoDTO getTooInfoById(long toolId) throws ResourceNotFoundException {
		Tool search = this.toolDao.findById(toolId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.WEAPON_NOT_FOUND));
		return ToolMapper.entityToInfo(search);
	}
	
	
}
