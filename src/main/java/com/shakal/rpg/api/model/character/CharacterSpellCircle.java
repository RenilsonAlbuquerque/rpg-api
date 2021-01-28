package com.shakal.rpg.api.model.character;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.shakal.rpg.api.model.embedded.CharacterSpellCircleId;

@Entity
@Table(name= "tb_character_spell_circle")
public class CharacterSpellCircle {
	
	/*
	@Id
	@EmbeddedId
	private CharacterSpellCircleId id;
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private short quantity;
	private short totalAmount;
	private String spellText;
	
	@MapsId("spellCircle")
	private Short spellCircle;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private CharacterSpell characterSpell;
	
	/*
	public CharacterSpellCircleId getId() {
		return id;
	}
	public void setId(CharacterSpellCircleId id) {
		this.id = id;
	}
	*/
	
	public short getQuantity() {
		return quantity;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public void setSpellCircle(Short spellCircle) {
		this.spellCircle = spellCircle;
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

	public CharacterSpell getCharacterSpell() {
		return characterSpell;
	}

	public void setCharacterSpell(CharacterSpell characterSpell) {
		this.characterSpell = characterSpell;
	}
	
	
	

}
