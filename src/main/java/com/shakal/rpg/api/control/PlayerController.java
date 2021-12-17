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

import com.shakal.rpg.api.contracts.service.IPlayerService;
import com.shakal.rpg.api.dto.combat.PlayersStateDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	private IPlayerService playerService;
	
	@GetMapping(value="/status/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PlayersStateDTO> getPlayersListByStoryId(@PathVariable Long id) throws ResourceNotFoundException{
		return new ResponseEntity<PlayersStateDTO>(this.playerService.getPlayerStatusByStoryId(id), HttpStatus.OK);
    }

	@GetMapping(value="/state/create/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<PlayersStateDTO> getPlayersStateCreateByStoryId(@PathVariable Long id) throws ResourceNotFoundException{
		return new ResponseEntity<PlayersStateDTO>(this.playerService.mountPlayersStateOnStory(id), HttpStatus.OK);
	}

}
