package com.shakal.rpg.api.model.character;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.shakal.rpg.api.model.embedded.BagEquipmentId;
import com.shakal.rpg.api.model.equipament.Equipament;

@Entity
@Table(name= "mtm_bag_equipment")
public class BagEquipment {

	@EmbeddedId
	private BagEquipmentId id;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@MapsId("bagId")
	private Bag bag;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@MapsId("equipmentId")
	private Equipament equipment;
	
	private int quantity;

	public BagEquipmentId getId() {
		return id;
	}

	public void setId(BagEquipmentId id) {
		this.id = id;
	}

	public Bag getBag() {
		return bag;
	}

	public void setBag(Bag bag) {
		this.bag = bag;
	}

	public Equipament getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipament equipment) {
		this.equipment = equipment;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
