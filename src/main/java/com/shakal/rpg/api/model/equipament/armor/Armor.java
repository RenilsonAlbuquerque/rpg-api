package com.shakal.rpg.api.model.equipament.armor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.shakal.rpg.api.model.equipament.Equipament;



@Entity
@Table(name="tb_armor")
@PrimaryKeyJoinColumn(name = "id")
public class Armor extends Equipament  {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private int acBonus;
	
	private short minStrength;
	
	private boolean stealthDisadvantage;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,targetEntity = ArmorCategory.class)
	@JoinColumn(name ="category_id", referencedColumnName = "id")
	private ArmorCategory category;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,targetEntity = ArmorAC.class)
	@JoinColumn(name ="armor_class_id", referencedColumnName = "id")
	private ArmorAC armorClass;

	public int getAcBonus() {
		return acBonus;
	}

	public void setAcBonus(int acBonus) {
		this.acBonus = acBonus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArmorAC getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(ArmorAC armorClass) {
		this.armorClass = armorClass;
	}

	public boolean isStealthDisadvantage() {
		return stealthDisadvantage;
	}

	public void setStealthDisadvantage(boolean stealthDisadvantage) {
		this.stealthDisadvantage = stealthDisadvantage;
	}

	public ArmorCategory getCategory() {
		return category;
	}

	public void setCategory(ArmorCategory category) {
		this.category = category;
	}

	public short getMinStrength() {
		return minStrength;
	}

	public void setMinStrength(short minStrength) {
		this.minStrength = minStrength;
	}
	
	
	
	
}
