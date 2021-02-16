package com.shakal.rpg.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shakal.rpg.api.contracts.service.IToolService;
import com.shakal.rpg.api.dto.info.ToolInfoDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/tool")
public class ToolController {
	
	@Autowired
	private IToolService toolService;
	
	@GetMapping(value="/detail/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ToolInfoDTO> getCharacterSheet(@PathVariable Long id) throws ResourceNotFoundException{
		return new ResponseEntity<ToolInfoDTO>(this.toolService.getTooInfoById(id), HttpStatus.OK);
    }

}
