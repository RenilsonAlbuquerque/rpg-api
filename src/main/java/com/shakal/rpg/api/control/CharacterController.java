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

import com.shakal.rpg.api.contracts.service.IBagService;
import com.shakal.rpg.api.contracts.service.ICharacterService;
import com.shakal.rpg.api.dto.create.CharacterCreateDTO;
import com.shakal.rpg.api.dto.create.CharacterCreateInputDTO;
import com.shakal.rpg.api.dto.create.CharacterHeaderInputDTO;
import com.shakal.rpg.api.dto.filter.UserSheetFIlterDTO;
import com.shakal.rpg.api.dto.info.BagInfoDTO;
import com.shakal.rpg.api.dto.info.CharacterGeneralInfoDTO;
import com.shakal.rpg.api.dto.info.CharacterSheetDTO;
import com.shakal.rpg.api.dto.info.CharacterSpellDTO;
import com.shakal.rpg.api.dto.info.CharcterTraitDTO;
import com.shakal.rpg.api.exception.BusinessException;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.service.SpellService;
import com.shakal.rpg.api.service.TraitService;

@CrossOrigin
@RestController
@RequestMapping("/character")
public class CharacterController {

	@Autowired
	private ICharacterService characterService;
	
	@Autowired
	private SpellService spellService;
	
	@Autowired
	private TraitService traitService;
	
	@Autowired
	private IBagService bagService;
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> createCharacter(@RequestBody CharacterCreateDTO createDto) throws BusinessException, FileManagementException{
		return new ResponseEntity<Boolean>(this.characterService.createCharacterInStory(createDto), HttpStatus.OK);
    }
	@GetMapping(value="/metadata",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CharacterCreateInputDTO> getCharacterCreationMetadata(){
		return new ResponseEntity<CharacterCreateInputDTO>(this.characterService.getCharacterCreationMetadata(), HttpStatus.OK);
    }
	@GetMapping(value="/header-metadata",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CharacterHeaderInputDTO> getCharacterHeader() throws ResourceNotFoundException {
		return new ResponseEntity<CharacterHeaderInputDTO>(this.characterService.getHeaderInput(), HttpStatus.OK);
    }
	@PostMapping(value="/user-story",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CharacterGeneralInfoDTO> getCharacterSheetOnStory(@RequestBody UserSheetFIlterDTO filterDto) throws ResourceNotFoundException{
		return new ResponseEntity<CharacterGeneralInfoDTO>(this.characterService.getCharacterSheetByUserInStory(filterDto), HttpStatus.OK);
    }
	@GetMapping(value="/sheet/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CharacterSheetDTO> getCharacterSheet(@PathVariable Long id) throws ResourceNotFoundException{
		return new ResponseEntity<CharacterSheetDTO>(this.characterService.getCharacterSheet(id), HttpStatus.OK);
    }
	@PostMapping(value="/sheet",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> updateCharacterSheet(@RequestBody CharacterSheetDTO sheetInputDto) throws ResourceNotFoundException{
		return new ResponseEntity<Boolean>(this.characterService.updateCharacterSheet(sheetInputDto), HttpStatus.OK);
    }
	@GetMapping(value="/spells/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CharacterSpellDTO> getCharacterSpells(@PathVariable Long id) throws ResourceNotFoundException {
		return new ResponseEntity<CharacterSpellDTO>(this.spellService.getSpellsOfCharacter(id), HttpStatus.OK);
    }
	@PostMapping(value="/spells/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> updateCharacterSpellsList(@RequestBody CharacterSpellDTO inputDto,@PathVariable Long id) throws BusinessException, FileManagementException, ResourceNotFoundException{
		return new ResponseEntity<Boolean>(this.spellService.updateCreatureSpells(inputDto,id), HttpStatus.OK);
    }
	
	@GetMapping(value="/traits/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CharcterTraitDTO> getCharacterTraits(@PathVariable Long id) throws ResourceNotFoundException {
		return new ResponseEntity<CharcterTraitDTO>(this.traitService.getTraitsOfCharacter(id), HttpStatus.OK);
    }
	@PostMapping(value="/traits/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> updateCharacterTraits(@RequestBody CharcterTraitDTO inputDto,@PathVariable Long id) throws BusinessException, FileManagementException, ResourceNotFoundException{
		return new ResponseEntity<Boolean>(this.traitService.updateCreatureTraits(inputDto,id), HttpStatus.OK);
    }
	@GetMapping(value="/bag/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BagInfoDTO> getCharacterBag(@PathVariable Long id) throws ResourceNotFoundException {
		return new ResponseEntity<BagInfoDTO>(this.bagService.getBagOfCharacter(id), HttpStatus.OK);
    }
	
	@PostMapping(value="/bag/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> updateCharacterBag(@RequestBody BagInfoDTO inputDto,@PathVariable Long id) throws BusinessException, FileManagementException, ResourceNotFoundException{
		return new ResponseEntity<Boolean>(this.bagService.updateCreatureBag(inputDto,id), HttpStatus.OK);
    }
	
	
}
