package com.shakal.rpg.api.dto.create;



public class ArmorCreateDTO extends EquipmentCreateDTO {

	private long armorCategory;
	private int armorAcBonus;
	private short baseAC;
	private long atributeModifier;
	private int limitAtributeModifier;
	private short minStrength;
	private boolean stealthDisvantage;
	
	public long getArmorCategory() {
		return armorCategory;
	}
	public void setArmorCategory(long armorCategory) {
		this.armorCategory = armorCategory;
	}
	public int getArmorAcBonus() {
		return armorAcBonus;
	}
	public void setArmorAcBonus(int armorAcBonus) {
		this.armorAcBonus = armorAcBonus;
	}
	public short getBaseAC() {
		return baseAC;
	}
	public void setBaseAC(short baseAC) {
		this.baseAC = baseAC;
	}
	public long getAtributeModifier() {
		return atributeModifier;
	}
	public void setAtributeModifier(long atributeModifier) {
		this.atributeModifier = atributeModifier;
	}
	public int getLimitAtributeModifier() {
		return limitAtributeModifier;
	}
	public void setLimitAtributeModifier(int limitAtributeModifier) {
		this.limitAtributeModifier = limitAtributeModifier;
	}
	public short getMinStrength() {
		return minStrength;
	}
	public void setMinStrength(short minStrength) {
		this.minStrength = minStrength;
	}
	public boolean isStealthDisvantage() {
		return stealthDisvantage;
	}
	public void setStealthDisvantage(boolean stealthDisvantage) {
		this.stealthDisvantage = stealthDisvantage;
	}
	
	
	
	
	
	
}
