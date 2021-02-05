package com.shakal.rpg.api.dto.info;

import java.util.List;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;

public class ArmorInfoDTO {

	private long id;
	private String imagePath;
	private String name;
	private String description;
	private double weight;
	private KeyValueDTO rarity;
	private CostInfoDTO cost;
	
	private int bonus;
	private KeyValueDTO category;
	private String armorClass;
	private String minStrength;
	private boolean stealthDisvantage;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public KeyValueDTO getRarity() {
		return rarity;
	}
	public void setRarity(KeyValueDTO rarity) {
		this.rarity = rarity;
	}
	public CostInfoDTO getCost() {
		return cost;
	}
	public void setCost(CostInfoDTO cost) {
		this.cost = cost;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public KeyValueDTO getCategory() {
		return category;
	}
	public void setCategory(KeyValueDTO category) {
		this.category = category;
	}
	public String getArmorClass() {
		return armorClass;
	}
	public void setArmorClass(String armorClass) {
		this.armorClass = armorClass;
	}
	public String getMinStrength() {
		return minStrength;
	}
	public void setMinStrength(String minStrength) {
		this.minStrength = minStrength;
	}
	public boolean isStealthDisvantage() {
		return stealthDisvantage;
	}
	public void setStealthDisvantage(boolean stealthDisvantage) {
		this.stealthDisvantage = stealthDisvantage;
	}
	
	
	
	
}
