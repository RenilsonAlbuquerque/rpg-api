package com.shakal.rpg.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shakal.rpg.api.contracts.service.IArmorService;
import com.shakal.rpg.api.dto.create.ArmorCreateDTO;
import com.shakal.rpg.api.dto.info.ArmorInfoDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/armor")
public class ArmorController {

	@Autowired
	private IArmorService armorService;
	
	@GetMapping(value="/detail/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmorInfoDTO> getArmorDetail(@PathVariable Long id) throws ResourceNotFoundException{
		return new ResponseEntity<ArmorInfoDTO>(this.armorService.getArmorInfoById(id), HttpStatus.OK);
    }
	@PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ArmorCreateDTO> createArmor(@RequestBody ArmorCreateDTO inputDTO) throws ResourceNotFoundException{
	    	
	    return new ResponseEntity<ArmorCreateDTO>(armorService.createArmor(inputDTO), HttpStatus.OK);
	}
}
