package com.shakal.rpg.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.IBagService;
import com.shakal.rpg.api.dto.info.BagInfoDTO;
import com.shakal.rpg.api.dto.info.CharacterSpellDTO;
import com.shakal.rpg.api.dto.overview.EquipmentBagOverviewDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.BagMapper;
import com.shakal.rpg.api.mappers.CharacterSpellMapper;
import com.shakal.rpg.api.model.character.Bag;
import com.shakal.rpg.api.model.character.BagEquipment;
import com.shakal.rpg.api.model.character.Character;
import com.shakal.rpg.api.model.character.CharacterSpell;
import com.shakal.rpg.api.model.embedded.BagEquipmentId;
import com.shakal.rpg.api.model.equipament.Equipament;
import com.shakal.rpg.api.repository.BagDAO;
import com.shakal.rpg.api.repository.CharacterDAO;
import com.shakal.rpg.api.repository.EquipmentDAO;
import com.shakal.rpg.api.utils.Messages;

@Service
public class BagService implements IBagService {

	private BagDAO bagDao;
	private CharacterDAO characterDao;
	private EquipmentDAO equipmentDao;
	
	public BagService(BagDAO bagDao,CharacterDAO characterDao,EquipmentDAO equipmentDao) {
		this.bagDao = bagDao;
		this.characterDao = characterDao;
		this.equipmentDao = equipmentDao;
	}
	
	@Override
	public BagInfoDTO getBagOfCharacter(long id) throws ResourceNotFoundException {
		
		Bag bagSearch = this.bagDao.getCharacterBagByCharacterId(id);
		if(bagSearch != null) {
			//CharacterSpell spell = this.characterSpellDAO.getCharacterSpellByCharacterId(id);
			return BagMapper.entityToDTO(bagSearch);
		}else {
			return BagMapper.createEmptyDTO(id);
		}
	}
	@Override
	public boolean updateCreatureBag(BagInfoDTO inputDto,long characterId) throws ResourceNotFoundException {
		Character characterSearch = this.characterDao.findById(characterId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.CHARACTER_NOT_FOUND));
		
		Optional<Bag> bagSearch = this.bagDao.findById(inputDto.getId());
		
	
		if(bagSearch.isPresent()) {
			Bag bag = bagSearch.get();
			bag.setPlatinumPieces(inputDto.getPlatinum());
			bag.setGoldPieces(inputDto.getGold());
			bag.setElectrumPieces(inputDto.getElectrum());
			bag.setSilverPieces(inputDto.getSilver());
			bag.setCopperPieces(inputDto.getCopper());
			bag.setBagEquipments(this.updateEquipmentsOfBag(bag,bag.getBagEquipments(),inputDto.getEquipments()));
			this.bagDao.save(bag);
		}
		else {
			Bag bag = new Bag();
			bag.setPlatinumPieces(inputDto.getPlatinum());
			bag.setGoldPieces(inputDto.getGold());
			bag.setElectrumPieces(inputDto.getElectrum());
			bag.setSilverPieces(inputDto.getSilver());
			bag.setCopperPieces(inputDto.getCopper());
			bag.setBagEquipments(new ArrayList<>());
			bag = this.bagDao.save(bag);
			bag.setBagEquipments(this.updateEquipmentsOfBag(bag,bag.getBagEquipments(),inputDto.getEquipments()));
			this.bagDao.save(bag);
		}
		
		return true;
	}
	private List<BagEquipment> updateEquipmentsOfBag(Bag bag,List<BagEquipment> bagEquipments,List<EquipmentBagOverviewDTO> inputEquipments) {
		
		//Add or upadte
		
		for(EquipmentBagOverviewDTO dtoValue:inputEquipments) {
			boolean found = false;
			for(BagEquipment equipmentEntity: bagEquipments) {
				if(equipmentEntity.getId().getEquipmentId() == dtoValue.getId()) {
					found = true;
					equipmentEntity.setQuantity(dtoValue.getQuantity());
				}
			}
			if(!found) {
				Optional<Equipament> search = this.equipmentDao.findById(dtoValue.getId());
				if(search.isPresent()) {
					BagEquipment bagEquipment = new BagEquipment();
					BagEquipmentId beId = new BagEquipmentId(bag.getId(),search.get().getId());
					bagEquipment.setId(beId);
					bagEquipment.setEquipment(search.get());
					bagEquipment.setBag(bag);
					bagEquipment.setQuantity(dtoValue.getQuantity());
					bagEquipments.add(bagEquipment);
				}
			}
			
		}
		///=====remove==================================
		for(int i = 0; i < bagEquipments.size(); i++) {
			boolean found = false;
			for(EquipmentBagOverviewDTO dtoValue:inputEquipments) {
				if(bagEquipments.get(i).getId().getEquipmentId() == dtoValue.getId()) {
					found = true;
				}
			}
			if(!found) {
				bagEquipments.remove(i);
			}
		}
		return bagEquipments;
		
	}
}
