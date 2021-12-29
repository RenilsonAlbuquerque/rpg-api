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

import com.shakal.rpg.api.contracts.service.IMonsterService;
import com.shakal.rpg.api.dto.MonsterSheetDTO;
import com.shakal.rpg.api.dto.combat.CreatureCardDTO;
import com.shakal.rpg.api.dto.create.MonsterCreateDTO;
import com.shakal.rpg.api.dto.create.MonsterCreateInputDTO;
import com.shakal.rpg.api.dto.filter.CustomPage;
import com.shakal.rpg.api.dto.filter.PaginationFilter;
import com.shakal.rpg.api.dto.info.MonsterInfoDTO;
import com.shakal.rpg.api.dto.overview.MonsterOverviewDTO;
import com.shakal.rpg.api.exception.BusinessException;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

import java.util.concurrent.TimeUnit;


@CrossOrigin
@RestController
@RequestMapping("/monster")
public class MonsterController {

	@Autowired
	private IMonsterService monsterService;
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MonsterCreateDTO> createMoster(@RequestBody MonsterCreateDTO createDto) throws ResourceNotFoundException,BusinessException, FileManagementException{
		return new ResponseEntity<MonsterCreateDTO>(this.monsterService.insertMonster(createDto), HttpStatus.OK);
    }
	
	@PostMapping(value="/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CustomPage<MonsterOverviewDTO>> listAllOverview(@RequestBody PaginationFilter filter){
        return new ResponseEntity<CustomPage<MonsterOverviewDTO>>(monsterService.listsMonsterPaged(filter), HttpStatus.OK);
    }
	
	@GetMapping("/sheet/{id}")
    public ResponseEntity<MonsterSheetDTO> getMonsterById(@PathVariable Long id) throws ResourceNotFoundException {
		return ResponseEntity.ok()
				.cacheControl(CacheControl.maxAge(120, TimeUnit.MINUTES))
				.body(monsterService.getMonsterSheetById(id));
    }
	@GetMapping("/edit/{id}")
    public ResponseEntity<MonsterCreateDTO> getMonsterToEditById(@PathVariable Long id) throws ResourceNotFoundException {
        return new ResponseEntity<MonsterCreateDTO>(monsterService.getMonsterInputToEditById(id), HttpStatus.OK);
    }
	@GetMapping("/card/{id}")
    public ResponseEntity<CreatureCardDTO> getMonsterCardById(@PathVariable Long id) throws ResourceNotFoundException {
    	
        return new ResponseEntity<CreatureCardDTO>(monsterService.getMonsterCardById(id), HttpStatus.OK);
    }
	 @PostMapping(value = "/filter",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public ResponseEntity<CustomPage<MonsterOverviewDTO>> filter(@RequestBody PaginationFilter filter,
	    													@RequestParam(required = false) String name
	    													){
	    	
	    	 return new ResponseEntity<CustomPage<MonsterOverviewDTO>>
	    	 		(monsterService.searchMonsterPaged(name,filter), HttpStatus.OK);
	 }
	 @GetMapping("/info/{id}")
	 public ResponseEntity<MonsterInfoDTO> getMonsterInfoById(@PathVariable Long id) throws ResourceNotFoundException {
		 return ResponseEntity.ok()
				 .cacheControl(CacheControl.maxAge(120, TimeUnit.MINUTES))
				 .body(monsterService.getMonsterInfoById(id));
	 }
	 @GetMapping("/input")
	 public ResponseEntity<MonsterCreateInputDTO> getMonsterValuesToCreate() {
	    	
	     return new ResponseEntity<MonsterCreateInputDTO>(monsterService.getMonsterInfoToCreate(), HttpStatus.OK);
	 }
	 
	

}
