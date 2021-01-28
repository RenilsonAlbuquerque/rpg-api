package com.shakal.rpg.api.dto.info;

public class CreatureSpellInfoDTO{
	
	private long id;
	private short quantity;
	private short totalAmount;
	private String spellText;
	private short spellCircle;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public short getQuantity() {
		return quantity;
	}
	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}
	public short getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(short totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getSpellText() {
		return spellText;
	}
	public void setSpellText(String spellText) {
		this.spellText = spellText;
	}
	public short getSpellCircle() {
		return spellCircle;
	}
	public void setSpellCircle(short spellCircle) {
		this.spellCircle = spellCircle;
	}
	
	

}
