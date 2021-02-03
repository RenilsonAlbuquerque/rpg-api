package com.shakal.rpg.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.IWeaponService;
import com.shakal.rpg.api.dto.create.DamageDiceDTO;
import com.shakal.rpg.api.dto.create.WeaponCreateDTO;
import com.shakal.rpg.api.dto.filter.CustomPage;
import com.shakal.rpg.api.dto.filter.PaginationFilter;
import com.shakal.rpg.api.dto.info.WeaponInfoDTO;
import com.shakal.rpg.api.dto.overview.WeaponOverviewDTO;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.mappers.WeaponMapper;
import com.shakal.rpg.api.model.Alignment;
import com.shakal.rpg.api.model.CreatureLevel;
import com.shakal.rpg.api.model.DamageType;
import com.shakal.rpg.api.model.Dice;
import com.shakal.rpg.api.model.Monster;
import com.shakal.rpg.api.model.MonsterType;
import com.shakal.rpg.api.model.creature.CreatureSize;
import com.shakal.rpg.api.model.economy.Coin;
import com.shakal.rpg.api.model.economy.Cost;
import com.shakal.rpg.api.model.embedded.WeaponDiceId;
import com.shakal.rpg.api.model.equipament.Rarity;
import com.shakal.rpg.api.model.relation.WeaponDice;
import com.shakal.rpg.api.model.weapon.Weapon;
import com.shakal.rpg.api.model.weapon.WeaponCategory;
import com.shakal.rpg.api.model.weapon.WeaponClassification;
import com.shakal.rpg.api.model.weapon.WeaponRange;
import com.shakal.rpg.api.repository.CoinDAO;
import com.shakal.rpg.api.repository.DamageTypeDAO;
import com.shakal.rpg.api.repository.DiceDAO;
import com.shakal.rpg.api.repository.RarityDAO;
import com.shakal.rpg.api.repository.WeaponClassificationDAO;
import com.shakal.rpg.api.repository.WeaponDAO;
import com.shakal.rpg.api.repository.WeaponDiceDAO;
import com.shakal.rpg.api.repository.WeaponPropertyDAO;
import com.shakal.rpg.api.repository.WeaponRangeDAO;
import com.shakal.rpg.api.specification.WeaponSpecification;
import com.shakal.rpg.api.utils.Messages;
import com.shakal.rpg.api.utils.PaginationGenerator;
import com.shakal.rpg.api.validators.ErrorMessages;

@Service
public class WeaponService implements IWeaponService{

	private WeaponDAO weaponRepository;
	private CoinDAO coinDAO;
	private RarityDAO rarityDAO;
	private WeaponRangeDAO weaponRangeDAO;
	private WeaponClassificationDAO weaponClassificationDAO;
	private WeaponPropertyDAO weaponPropertyDAO;
	private DiceDAO diceDao;
	private DamageTypeDAO damageTypeDao;
	private WeaponDiceDAO weaponDiceDao;
	
	@Autowired
	public WeaponService(WeaponDAO weaponRepository,CoinDAO coinDAO,RarityDAO rarityDAO,WeaponRangeDAO weaponRangeDAO,
			WeaponClassificationDAO weaponClassificationDAO,WeaponPropertyDAO weaponPropertyDAO,
			DiceDAO diceDao,DamageTypeDAO damageTypeDao,WeaponDiceDAO weaponDiceDao) {
		this.weaponRepository = weaponRepository;
		this.diceDao = diceDao;
		this.damageTypeDao = damageTypeDao;
		this.coinDAO = coinDAO;
		this.rarityDAO = rarityDAO;
		this.weaponRangeDAO = weaponRangeDAO;
		this.weaponClassificationDAO = weaponClassificationDAO;
		this.weaponPropertyDAO = weaponPropertyDAO;
		this.weaponDiceDao = weaponDiceDao;
	}

	@Override
	public CustomPage<WeaponOverviewDTO> getWeaponList(String search, PaginationFilter filter) {
		Specification<Weapon> specification = WeaponSpecification.searchWeapon(search);
	    
    	Page<Weapon> page = this.weaponRepository.findAll(specification,PageRequest.of(filter.getPage() -1, 
				filter.getSize()));
    	return (CustomPage<WeaponOverviewDTO>) PaginationGenerator.convertPage(page,
    			page
        		.stream().map( weapon -> WeaponMapper.entityToOverview(weapon))
                .collect(Collectors.toList()));
	}

	@Override
	public WeaponInfoDTO getWeaponDetail(long id) throws ResourceNotFoundException {
		Weapon search = this.weaponRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(Messages.WEAPON_NOT_FOUND));
		return WeaponMapper.entityToInfo(search);
	}
	@Override
	public WeaponCreateDTO createWeapon(WeaponCreateDTO inputDTO) throws ResourceNotFoundException {
		ErrorMessages error = new ErrorMessages();
		
		//Search entities
		Rarity raritySearch = this.rarityDAO.findById(inputDTO.getRarity())
						.orElseThrow(() -> new ResourceNotFoundException(Messages.INVALID_MONSTER_TYPE));
				
		Coin coinSearch = this.coinDAO.findById((long)inputDTO.getCoin())
						.orElseThrow(() -> new ResourceNotFoundException(Messages.COIN_INVALID));
				
		WeaponClassification classificationSearch = this.weaponClassificationDAO.findById(inputDTO.getWeaponType())
						.orElseThrow(() -> new ResourceNotFoundException(Messages.INVALID_CREATURE_ALIGNMENT));
				
		WeaponRange rangeSearch = this.weaponRangeDAO.findById(inputDTO.getWeaponRange())
						.orElseThrow(() -> new ResourceNotFoundException(Messages.INVALID_MONSTER_CHALLENGE_LEVEL));
		
		Weapon entity = new Weapon();
		entity.setName(inputDTO.getName());
		entity.setDescription(inputDTO.getDescription());
		entity.setImagePath(inputDTO.getImagePath());
		entity.setWeight(inputDTO.getWeight());
		entity.setRarity(raritySearch);
		entity.setClassification(classificationSearch);
		
		Cost cost = new Cost();
		cost.setCoin(coinSearch);
		cost.setQuantity(inputDTO.getPrice());
		entity.setPrice(cost);
		
		entity.setClassification(classificationSearch);
		entity.setRange(rangeSearch);
		entity.setBonus(inputDTO.getWeaponDamageBonus());
		
		
		entity.setProperties(inputDTO.getWeaponProperties().stream()
				.map(property -> this.weaponPropertyDAO.getOne(property.getId()))
				.collect(Collectors.toList()));
		
		entity = this.weaponRepository.save(entity);
		mountWeaponDices(inputDTO.getWeaponDamages(),entity);
		
		
		return inputDTO;
		
	}
	@Transient
	private void mountWeaponDices(List<DamageDiceDTO> weaponDamages,Weapon weapon){
		//List<WeaponDice> result = new ArrayList<WeaponDice>();
		for(DamageDiceDTO weaponDice: weaponDamages) {
			Dice diceSearch = this.diceDao.getOne(weaponDice.getDice());
			DamageType damageSearch = this.damageTypeDao.getOne(weaponDice.getDamageType());
			WeaponDiceId id = new WeaponDiceId();
			id.setDiceId(diceSearch.getId());
			id.setWeaponId(damageSearch.getId());
			WeaponDice weaponDiceEntity = new WeaponDice();
			weaponDiceEntity.setId(id);
			weaponDiceEntity.setDamageType(damageSearch);
			weaponDiceEntity.setDice(diceSearch);
			weaponDiceEntity.setQuantity(weaponDice.getQuantity());
			weaponDiceEntity.setWeapon(weapon);
			this.weaponDiceDao.save(weaponDiceEntity);
			//result.add(weaponDiceEntity);
		}
		//return result;
	}

	

}
