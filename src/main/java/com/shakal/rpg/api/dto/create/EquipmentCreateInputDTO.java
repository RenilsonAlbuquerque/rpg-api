package com.shakal.rpg.api.dto.create;

import java.util.List;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;
import com.shakal.rpg.api.dto.info.CoinInfoDTO;

public class EquipmentCreateInputDTO {

	private List<CoinInfoDTO> coins;
	private List<KeyValueDTO> rarities;
	private List<KeyValueDTO> equipmentTypes;
	private List<KeyValueDTO> weaponClassifications;
	private List<KeyValueDTO> weaponRanges;
	private List<KeyValueDTO> weaponProperties;
	private List<KeyValueDTO> dices;
	private List<KeyValueDTO> damageType;
	
	public List<CoinInfoDTO> getCoins() {
		return coins;
	}
	public void setCoins(List<CoinInfoDTO> coins) {
		this.coins = coins;
	}
	public List<KeyValueDTO> getRarities() {
		return rarities;
	}
	public void setRarities(List<KeyValueDTO> rarities) {
		this.rarities = rarities;
	}
	public List<KeyValueDTO> getEquipmentTypes() {
		return equipmentTypes;
	}
	public void setEquipmentTypes(List<KeyValueDTO> equipmentType) {
		this.equipmentTypes = equipmentType;
	}
	
	public List<KeyValueDTO> getWeaponClassifications() {
		return weaponClassifications;
	}
	public void setWeaponClassifications(List<KeyValueDTO> weaponClassifications) {
		this.weaponClassifications = weaponClassifications;
	}
	public List<KeyValueDTO> getWeaponRanges() {
		return weaponRanges;
	}
	public void setWeaponRanges(List<KeyValueDTO> weaponRanges) {
		this.weaponRanges = weaponRanges;
	}
	public List<KeyValueDTO> getWeaponProperties() {
		return weaponProperties;
	}
	public void setWeaponProperties(List<KeyValueDTO> weaponProperties) {
		this.weaponProperties = weaponProperties;
	}
	public List<KeyValueDTO> getDices() {
		return dices;
	}
	public void setDices(List<KeyValueDTO> dices) {
		this.dices = dices;
	}
	public List<KeyValueDTO> getDamageType() {
		return damageType;
	}
	public void setDamageType(List<KeyValueDTO> damageType) {
		this.damageType = damageType;
	}
	
	
	
}
