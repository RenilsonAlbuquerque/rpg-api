package com.shakal.rpg.api.model.equipament.armor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shakal.rpg.api.model.Atribute;

@Entity
@Table(name= "tb_armor_armor_class")
public class ArmorAC {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;

	private short armorClassBase;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,targetEntity = Atribute.class)
	@JoinColumn(name ="armor_atribute_id", referencedColumnName = "id")
	private Atribute atribute;
	
	private short maxValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public short getArmorClassBase() {
		return armorClassBase;
	}

	public void setArmorClassBase(short armorClassBase) {
		this.armorClassBase = armorClassBase;
	}

	public Atribute getAtribute() {
		return atribute;
	}

	public void setAtribute(Atribute atribute) {
		this.atribute = atribute;
	}

	public short getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(short maxValue) {
		this.maxValue = maxValue;
	}

	

	
	
	
}
