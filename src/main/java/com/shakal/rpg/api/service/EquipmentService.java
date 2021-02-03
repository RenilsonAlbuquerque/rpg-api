package com.shakal.rpg.api.service;


import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.service.IEquipmentService;
import com.shakal.rpg.api.dto.create.EquipmentCreateInputDTO;
import com.shakal.rpg.api.dto.filter.CustomPage;
import com.shakal.rpg.api.dto.filter.PaginationFilter;
import com.shakal.rpg.api.dto.overview.EquipmentOverviewDTO;
import com.shakal.rpg.api.dto.overview.WeaponOverviewDTO;
import com.shakal.rpg.api.mappers.DamageMapper;
import com.shakal.rpg.api.mappers.DiceMapper;
import com.shakal.rpg.api.mappers.EconomyMapper;
import com.shakal.rpg.api.mappers.EquipmentMapper;
import com.shakal.rpg.api.mappers.RarityMapper;
import com.shakal.rpg.api.mappers.WeaponClassificationMapper;
import com.shakal.rpg.api.mappers.WeaponMapper;
import com.shakal.rpg.api.mappers.WeaponPropertyMapper;
import com.shakal.rpg.api.mappers.WeaponRangeMapper;
import com.shakal.rpg.api.model.Story;
import com.shakal.rpg.api.model.enums.EquipmentTypeEnum;
import com.shakal.rpg.api.model.equipament.Equipament;
import com.shakal.rpg.api.repository.CoinDAO;
import com.shakal.rpg.api.repository.DamageTypeDAO;
import com.shakal.rpg.api.repository.DiceDAO;
import com.shakal.rpg.api.repository.EquipmentDAO;
import com.shakal.rpg.api.repository.RarityDAO;
import com.shakal.rpg.api.repository.WeaponClassificationDAO;
import com.shakal.rpg.api.repository.WeaponPropertyDAO;
import com.shakal.rpg.api.repository.WeaponRangeDAO;
import com.shakal.rpg.api.utils.PaginationGenerator;

@Service
public class EquipmentService implements IEquipmentService {
	
	private EquipmentDAO equipmentDAO;
	private CoinDAO coinDAO;
	private RarityDAO rarityDAO;
	private WeaponRangeDAO weaponRangeDAO;
	private WeaponClassificationDAO weaponClassificationDAO;
	private WeaponPropertyDAO weaponPropertyDAO;
	private DiceDAO diceDao;
	private DamageTypeDAO damageTypeDao;

	@Autowired
	public EquipmentService(CoinDAO coinDAO,RarityDAO rarityDAO,WeaponRangeDAO weaponRangeDAO,
			WeaponClassificationDAO weaponClassificationDAO,WeaponPropertyDAO weaponPropertyDAO,
			DiceDAO diceDao,DamageTypeDAO damageTypeDao,EquipmentDAO equipmentDAO) {
		this.diceDao = diceDao;
		this.damageTypeDao = damageTypeDao;
		this.coinDAO = coinDAO;
		this.rarityDAO = rarityDAO;
		this.weaponRangeDAO = weaponRangeDAO;
		this.weaponClassificationDAO = weaponClassificationDAO;
		this.weaponPropertyDAO = weaponPropertyDAO;
		this.equipmentDAO = equipmentDAO;
	}
	
	@Override
	public EquipmentCreateInputDTO getEquipmentCreateInput() {
		EquipmentCreateInputDTO result = new EquipmentCreateInputDTO();
		
		result.setDamageType(this.damageTypeDao.findAll().stream()
				.map(damage -> DamageMapper.entityTODTO(damage)).collect(Collectors.toList()));
		result.setDices(this.diceDao.findAll().stream()
				.map(dice -> DiceMapper.diceEntityToDTO(dice)).collect(Collectors.toList()));
		result.setCoins(this.coinDAO.findAll().stream()
				.map(coin -> EconomyMapper.coinEntityToInfo(coin)).collect(Collectors.toList()));
		result.setRarities(this.rarityDAO.findAll().stream()
				.map(rarity -> RarityMapper.entityToDTO(rarity)).collect(Collectors.toList()));
		result.setEquipmentTypes(Arrays.asList(EquipmentTypeEnum.values()).stream()
				.map(type -> EquipmentMapper.enumToDTO(type)).collect(Collectors.toList()));
		result.setWeaponClassifications(this.weaponClassificationDAO.findAll().stream()
				.map(weaponClassification -> WeaponClassificationMapper.entityToDTO(weaponClassification)).collect(Collectors.toList()));
		result.setWeaponRanges(this.weaponRangeDAO.findAll().stream()
				.map(weaponRange -> WeaponRangeMapper.entityToDTO(weaponRange)).collect(Collectors.toList()));
		result.setWeaponProperties(this.weaponPropertyDAO.findAll().stream()
				.map(weaponProperty -> WeaponPropertyMapper.entityToDTO(weaponProperty)).collect(Collectors.toList()));
		return result;
	}

	@Override
	public CustomPage<EquipmentOverviewDTO> getEquipmentPaged(PaginationFilter filter) {
		Page<Equipament> page = this.equipmentDAO.findAll(PageRequest.of(filter.getPage() -1, 
				filter.getSize()));
		return (CustomPage<EquipmentOverviewDTO>) PaginationGenerator.convertPage(page,
    			page
        		.stream().map( equipment -> EquipmentMapper.entityToOverview(equipment))
                .collect(Collectors.toList()));
	}
	
	
	

}
