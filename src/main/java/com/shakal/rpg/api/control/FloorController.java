package com.shakal.rpg.api.control;

import java.util.List;

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
import com.shakal.rpg.api.contracts.service.IFloorService;
import com.shakal.rpg.api.dto.create.PlaceMarkCreateDTO;
import com.shakal.rpg.api.dto.info.FloorInfoDTO;
import com.shakal.rpg.api.dto.map.MapWallsDTO;
import com.shakal.rpg.api.dto.overview.PlaceMarkOverviewDTO;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/floor")
public class FloorController {
	
	@Autowired
	private IFloorService floorService;
	
	@Autowired
	private IFloorMarkService floorMarkService;

	@GetMapping("/info/{id}")
	public ResponseEntity<FloorInfoDTO> getFloorInfoById(@PathVariable Long id) throws ResourceNotFoundException {
	    return new ResponseEntity<FloorInfoDTO>(this.floorService.getFloorById(id), HttpStatus.OK);
	}
	@PostMapping(value="/create/mark",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PlaceMarkCreateDTO> createNewMark(@RequestBody PlaceMarkCreateDTO markDTO) throws ResourceNotFoundException{
        return new ResponseEntity<PlaceMarkCreateDTO>(this.floorMarkService.createFloorMark(markDTO), HttpStatus.OK);
    }
	@PostMapping(value="/update-walls-map/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> updateWallsMapFloor(@PathVariable Long id,@RequestBody List<MapWallsDTO> inputDto) throws ResourceNotFoundException, FileManagementException{
        return new ResponseEntity<Boolean>(this.floorService.updateFloorWallsImage(id,inputDto), HttpStatus.OK);
    }
	@GetMapping("/list/marks/{id}")
	public ResponseEntity<List<PlaceMarkOverviewDTO>> getPlacesMarksListByPlaceId(@PathVariable Long id) throws ResourceNotFoundException {
	    return new ResponseEntity<List<PlaceMarkOverviewDTO>>(this.floorMarkService.getAllPlaceMarksOfPlace(id), HttpStatus.OK);
	}
}
