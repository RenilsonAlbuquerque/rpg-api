package com.shakal.rpg.api.dto.overview;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;

public class EquipmentBagOverviewDTO {

	private long id;
	private String name;
	private int quantity;
	private double weight;
	private KeyValueDTO equipmentCategory;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public KeyValueDTO getEquipmentCategory() {
		return equipmentCategory;
	}
	public void setEquipmentCategory(KeyValueDTO equipmentCategory) {
		this.equipmentCategory = equipmentCategory;
	}
	
	
}
