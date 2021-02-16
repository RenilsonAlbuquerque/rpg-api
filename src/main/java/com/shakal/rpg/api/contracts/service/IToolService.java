package com.shakal.rpg.api.contracts.service;

import com.shakal.rpg.api.dto.info.ToolInfoDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface IToolService {

	ToolInfoDTO getTooInfoById(long toolId)  throws ResourceNotFoundException;
	
}
