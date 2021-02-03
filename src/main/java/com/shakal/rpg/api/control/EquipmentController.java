package com.shakal.rpg.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shakal.rpg.api.contracts.service.IEquipmentService;
import com.shakal.rpg.api.dto.create.EquipmentCreateInputDTO;
import com.shakal.rpg.api.dto.filter.CustomPage;
import com.shakal.rpg.api.dto.filter.PaginationFilter;
import com.shakal.rpg.api.dto.overview.EquipmentOverviewDTO;
import com.shakal.rpg.api.dto.overview.MonsterOverviewDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/equipment")
public class EquipmentController {
	
	@Autowired
	private IEquipmentService equipmentService;
	
	@GetMapping(value="/create-input",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<EquipmentCreateInputDTO> getCharacterSheet() throws ResourceNotFoundException{
		return new ResponseEntity<EquipmentCreateInputDTO>(this.equipmentService.getEquipmentCreateInput(), HttpStatus.OK);
    }
	 @PostMapping(value = "/filter",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public ResponseEntity<CustomPage<EquipmentOverviewDTO>> filter(@RequestBody PaginationFilter filter,
	    													@RequestParam(required = false) String name
	    													){
	    	 return new ResponseEntity<CustomPage<EquipmentOverviewDTO>>
	    	 		(equipmentService.getEquipmentPaged(filter), HttpStatus.OK);
	 }
	

}
