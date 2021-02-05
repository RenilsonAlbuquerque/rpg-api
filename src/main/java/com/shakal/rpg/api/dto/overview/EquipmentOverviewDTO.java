package com.shakal.rpg.api.dto.overview;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;

public class EquipmentOverviewDTO {

	private int id;
	private String name;
	private double weight;
	private String cost;
	private KeyValueDTO equipmentCategory;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public KeyValueDTO getEquipmentCategory() {
		return equipmentCategory;
	}
	public void setEquipmentCategory(KeyValueDTO equipmentCategory) {
		this.equipmentCategory = equipmentCategory;
	}
	
	
	
}
