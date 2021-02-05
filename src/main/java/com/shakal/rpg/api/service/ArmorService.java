package com.shakal.rpg.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.IArmorService;
import com.shakal.rpg.api.dto.create.ArmorCreateDTO;
import com.shakal.rpg.api.dto.info.ArmorInfoDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.ArmorMapper;
import com.shakal.rpg.api.mappers.WeaponMapper;
import com.shakal.rpg.api.model.Atribute;
import com.shakal.rpg.api.model.economy.Coin;
import com.shakal.rpg.api.model.economy.Cost;
import com.shakal.rpg.api.model.equipament.Rarity;
import com.shakal.rpg.api.model.equipament.armor.Armor;
import com.shakal.rpg.api.model.equipament.armor.ArmorAC;
import com.shakal.rpg.api.model.equipament.armor.ArmorCategory;
import com.shakal.rpg.api.model.equipament.weapon.Weapon;
import com.shakal.rpg.api.repository.ArmorCategoryDAO;
import com.shakal.rpg.api.repository.ArmorDAO;
import com.shakal.rpg.api.repository.AtributeDAO;
import com.shakal.rpg.api.repository.CoinDAO;
import com.shakal.rpg.api.repository.DamageTypeDAO;
import com.shakal.rpg.api.repository.DiceDAO;
import com.shakal.rpg.api.repository.RarityDAO;
import com.shakal.rpg.api.utils.Messages;
import com.shakal.rpg.api.validators.ErrorMessages;

@Service
public class ArmorService implements IArmorService{
	
	private CoinDAO coinDAO;
	private RarityDAO rarityDAO;
	private DiceDAO diceDao;
	private DamageTypeDAO damageTypeDao;
	private ArmorCategoryDAO armorCategoryDAO;
	private ArmorDAO armorDao;
	private AtributeDAO atributeDao;
	
	@Autowired
	public ArmorService(CoinDAO coinDAO,RarityDAO rarityDAO,DiceDAO diceDao,DamageTypeDAO damageTypeDao,
			ArmorCategoryDAO armorClassificationDAO,ArmorDAO armorDao,AtributeDAO atributeDao) {
		this.coinDAO = coinDAO;
		this.rarityDAO = rarityDAO;
		this.diceDao = diceDao;
		this.damageTypeDao = damageTypeDao;
		this.armorCategoryDAO = armorClassificationDAO;
		this.armorDao = armorDao;
		this.atributeDao = atributeDao;
	}

	@Override
	public ArmorCreateDTO createArmor(ArmorCreateDTO inputDTO) throws ResourceNotFoundException {
		
		ErrorMessages error = new ErrorMessages();
		
		//Search entities
		Rarity raritySearch = this.rarityDAO.findById(inputDTO.getRarity())
						.orElseThrow(() -> new ResourceNotFoundException(Messages.INVALID_MONSTER_TYPE));
				
		Coin coinSearch = this.coinDAO.findById((long)inputDTO.getCoin())
						.orElseThrow(() -> new ResourceNotFoundException(Messages.COIN_INVALID));
				
		ArmorCategory classificationSearch = this.armorCategoryDAO.findById(inputDTO.getArmorCategory())
						.orElseThrow(() -> new ResourceNotFoundException(Messages.ARMOR_NOT_FOUND));
		
		Atribute atributeSearch = null;
		if(inputDTO.getAtributeModifier() > 0) {
			atributeSearch = this.atributeDao.findById(inputDTO.getAtributeModifier())
					.orElseThrow(() -> new ResourceNotFoundException(Messages.ARMOR_NOT_FOUND));
		}
		
		
		
		Armor entity = new Armor();
		entity.setName(inputDTO.getName());
		entity.setDescription(inputDTO.getDescription());
		entity.setImagePath(inputDTO.getImagePath());
		entity.setWeight(inputDTO.getWeight());
		entity.setRarity(raritySearch);

		
		Cost cost = new Cost();
		cost.setCoin(coinSearch);
		cost.setQuantity(inputDTO.getPrice());
		entity.setPrice(cost);
		
		entity.setCategory(classificationSearch);
		entity.setAcBonus(inputDTO.getArmorAcBonus());
		entity.setMinStrength(inputDTO.getMinStrength());
		
		ArmorAC armorClass = new ArmorAC();
		armorClass.setArmorClassBase(inputDTO.getBaseAC());
		armorClass.setMaxValue(inputDTO.getMinStrength());
		if(inputDTO.getAtributeModifier() > 0 && atributeSearch != null) {
			armorClass.setAtribute(atributeSearch);
		}
		entity.setArmorClass(armorClass);
		
		entity.setStealthDisadvantage(inputDTO.isStealthDisvantage());
		this.armorDao.save(entity);
		
		return inputDTO;
	}

	@Override
	public ArmorInfoDTO getArmorInfoById(Long armorId) throws ResourceNotFoundException {
		Armor search = this.armorDao.findById(armorId)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.ARMOR_NOT_FOUND));
		return ArmorMapper.entityToInfoDTO(search);
	}
	
	

}
