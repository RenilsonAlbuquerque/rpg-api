package com.shakal.rpg.api.control;

import java.util.List;
import java.util.Map;

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

import com.shakal.rpg.api.contracts.service.IFloorMarkService;
import com.shakal.rpg.api.contracts.service.IPlaceService;
import com.shakal.rpg.api.dto.commons.NumberNumberDTO;
import com.shakal.rpg.api.dto.create.PlaceCreateDTO;
import com.shakal.rpg.api.dto.info.PlaceInfoDTO;
import com.shakal.rpg.api.dto.overview.PlaceOverviewDTO;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/place")
public class PlaceController {
	
	@Autowired
	private IPlaceService placeService;
	
	@Autowired
	private IFloorMarkService placeMarkService;
	
	
	@GetMapping("/info/{id}")
	public ResponseEntity<PlaceInfoDTO> getPlaceInfoById(@PathVariable Long id) throws ResourceNotFoundException {
	    return new ResponseEntity<PlaceInfoDTO>(this.placeService.getPlaceById(id), HttpStatus.OK);
	}
	@GetMapping("/floors/{id}")
	public ResponseEntity<List<NumberNumberDTO>> getFloorsListByPlaceId(@PathVariable Long id) throws ResourceNotFoundException {
	    return new ResponseEntity<List<NumberNumberDTO>>(this.placeService.getFloorsByPlaceId(id), HttpStatus.OK);
	}
	@GetMapping("/default-floor/{id}")
	public ResponseEntity<Long> getDefaultFloorByPlaceId(@PathVariable Long id) throws ResourceNotFoundException {
	    return new ResponseEntity<Long>(this.placeService.getDefaultFloorIdByPlaceId(id), HttpStatus.OK);
	}
	@GetMapping("/list/{id}")
	public ResponseEntity<List<PlaceOverviewDTO>> getPlacesList(@PathVariable Long id) throws ResourceNotFoundException {
	    return new ResponseEntity<List<PlaceOverviewDTO>>(this.placeService.getPlacesListByStoryId(id), HttpStatus.OK);
	}
	@PostMapping(value="/create",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PlaceOverviewDTO> createNewPlace(@RequestBody PlaceCreateDTO placeDTO) throws ResourceNotFoundException, FileManagementException{
        return new ResponseEntity<PlaceOverviewDTO>(this.placeService.createPlace(placeDTO), HttpStatus.OK);
    }
	
	@GetMapping(value="/delete/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> removePlace(@PathVariable Long id) throws ResourceNotFoundException{
        return new ResponseEntity<Boolean>(this.placeService.removePlace(id), HttpStatus.OK);
    }
	
}
