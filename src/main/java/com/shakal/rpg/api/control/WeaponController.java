package com.shakal.rpg.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shakal.rpg.api.contracts.service.IWeaponService;
import com.shakal.rpg.api.dto.create.WeaponCreateDTO;
import com.shakal.rpg.api.dto.filter.CustomPage;
import com.shakal.rpg.api.dto.filter.PaginationFilter;
import com.shakal.rpg.api.dto.info.WeaponInfoDTO;
import com.shakal.rpg.api.dto.overview.WeaponOverviewDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

import java.util.concurrent.TimeUnit;

@CrossOrigin
@RestController
@RequestMapping("/weapon")
public class WeaponController {
	
	@Autowired
	private IWeaponService weaponService;
	
	
	@PostMapping(value = "/filter",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public ResponseEntity<CustomPage<WeaponOverviewDTO>> filter(@RequestBody PaginationFilter filter,
	    													@RequestParam(required = false) String name
	    													){

	    	 return new ResponseEntity<CustomPage<WeaponOverviewDTO>>
	    	 		(weaponService.getWeaponList(name,filter), HttpStatus.OK);
	 }
	@GetMapping(value="/detail/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<WeaponInfoDTO> getWeaponDetail(@PathVariable Long id) throws ResourceNotFoundException{
		return ResponseEntity.ok()
				.cacheControl(CacheControl.maxAge(120, TimeUnit.MINUTES))
				.body(this.weaponService.getWeaponDetail(id));
    }
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<WeaponCreateDTO> createWeapon(@RequestBody WeaponCreateDTO inputDTO) throws ResourceNotFoundException{
	    	
	    	 return new ResponseEntity<WeaponCreateDTO>(weaponService.createWeapon(inputDTO), HttpStatus.OK);
	}

}
