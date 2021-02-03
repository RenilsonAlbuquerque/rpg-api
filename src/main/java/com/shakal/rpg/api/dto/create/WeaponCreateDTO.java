package com.shakal.rpg.api.dto.create;

import java.util.List;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;

public class WeaponCreateDTO extends EquipmentCreateDTO {
	
	private long weaponType;
	private long weaponRange;
	private List<DamageDiceDTO> weaponDamages;
	private List<KeyValueDTO> weaponProperties;
	private int weaponDamageBonus;
	
	
	public long getWeaponType() {
		return weaponType;
	}
	public void setWeaponType(long weaponType) {
		this.weaponType = weaponType;
	}
	public long getWeaponRange() {
		return weaponRange;
	}
	public void setWeaponRange(long weaponRange) {
		this.weaponRange = weaponRange;
	}
	public List<DamageDiceDTO> getWeaponDamages() {
		return weaponDamages;
	}
	public void setWeaponDamages(List<DamageDiceDTO> weaponDamages) {
		this.weaponDamages = weaponDamages;
	}
	public List<KeyValueDTO> getWeaponProperties() {
		return weaponProperties;
	}
	public void setWeaponProperties(List<KeyValueDTO> weaponProperties) {
		this.weaponProperties = weaponProperties;
	}
	public int getWeaponDamageBonus() {
		return weaponDamageBonus;
	}
	public void setWeaponDamageBonus(int weaponDamageBonus) {
		this.weaponDamageBonus = weaponDamageBonus;
	}
	
	
}
