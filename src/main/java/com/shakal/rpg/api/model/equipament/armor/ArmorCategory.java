package com.shakal.rpg.api.model.equipament.armor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.shakal.rpg.api.model.equipament.EquipamentCategory;

@Entity
@Table(name= "tb_armor_category")
@PrimaryKeyJoinColumn(name = "id")
public class ArmorCategory extends EquipamentCategory{


	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Armor.class)
	private List<Armor> armor;

	public List<Armor> getArmor() {
		return armor;
	}

	public void setArmor(List<Armor> armor) {
		this.armor = armor;
	}
	
	
}
