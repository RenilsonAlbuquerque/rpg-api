package com.shakal.rpg.api.dto.info;


import com.shakal.rpg.api.dto.commons.KeyValueDTO;

public class ToolInfoDTO {

	private long id;
	private String imagePath;
	private String name;
	private String description;
	private double weight;
	private KeyValueDTO rarity;
	private CostInfoDTO cost;
	private KeyValueDTO category;
	private int bonus;
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
	public KeyValueDTO getCategory() {
		return category;
	}
	public void setCategory(KeyValueDTO category) {
		this.category = category;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
