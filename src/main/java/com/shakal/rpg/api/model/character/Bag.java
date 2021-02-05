package com.shakal.rpg.api.model.character;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tb_character_bag")
public class Bag {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private short platinumPieces;
	private short goldPieces;
	private short electrumPieces;
	private short silverPieces;
	private short copperPieces;
	
	@OneToMany(mappedBy = "bag",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<BagEquipment> bagEquipments;
	
	@OneToOne(targetEntity = Character.class)
	@JoinColumn(name ="character_id")
	private Character character;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public short getPlatinumPieces() {
		return platinumPieces;
	}

	public void setPlatinumPieces(short platinumPieces) {
		this.platinumPieces = platinumPieces;
	}

	public short getGoldPieces() {
		return goldPieces;
	}

	public void setGoldPieces(short goldPieces) {
		this.goldPieces = goldPieces;
	}

	public short getElectrumPieces() {
		return electrumPieces;
	}

	public void setElectrumPieces(short electrumPieces) {
		this.electrumPieces = electrumPieces;
	}

	public short getSilverPieces() {
		return silverPieces;
	}

	public void setSilverPieces(short silverPieces) {
		this.silverPieces = silverPieces;
	}

	public short getCopperPieces() {
		return copperPieces;
	}

	public void setCopperPieces(short copperPieces) {
		this.copperPieces = copperPieces;
	}

	public List<BagEquipment> getBagEquipments() {
		return bagEquipments;
	}

	public void setBagEquipments(List<BagEquipment> bagEquipments) {
		this.bagEquipments = bagEquipments;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	
	
	
}
