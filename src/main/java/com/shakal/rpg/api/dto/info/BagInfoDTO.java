package com.shakal.rpg.api.dto.info;

import java.util.List;

import com.shakal.rpg.api.dto.overview.EquipmentBagOverviewDTO;

public class BagInfoDTO {

	private long id;
	private short platinum;
	private short gold;
	private short electrum;
	private short silver;
	private short copper;
	private List<EquipmentBagOverviewDTO> equipments;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public short getPlatinum() {
		return platinum;
	}
	public void setPlatinum(short platinum) {
		this.platinum = platinum;
	}
	public short getGold() {
		return gold;
	}
	public void setGold(short gold) {
		this.gold = gold;
	}
	public short getElectrum() {
		return electrum;
	}
	public void setElectrum(short electrum) {
		this.electrum = electrum;
	}
	public short getSilver() {
		return silver;
	}
	public void setSilver(short silver) {
		this.silver = silver;
	}
	public short getCopper() {
		return copper;
	}
	public void setCopper(short copper) {
		this.copper = copper;
	}
	public List<EquipmentBagOverviewDTO> getEquipments() {
		return equipments;
	}
	public void setEquipments(List<EquipmentBagOverviewDTO> equipments) {
		this.equipments = equipments;
	}
	
	
}
