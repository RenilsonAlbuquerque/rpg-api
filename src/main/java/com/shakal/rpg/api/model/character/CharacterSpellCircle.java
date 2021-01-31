package com.shakal.rpg.api.model.character;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


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
	private Long id;
	
	private short quantity;
	private short totalAmount;
	private String spellText;
	
	private Short spellCircle;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = CharacterSpell.class)
	@JoinColumn(name ="character_spell_id")
	private CharacterSpell characterSpell;
	
	/*
	public CharacterSpellCircleId getId() {
		return id;
	}
	public void setId(CharacterSpellCircleId id) {
		this.id = id;
	}
	*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public short getQuantity() {
		return quantity;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharacterSpellCircle other = (CharacterSpellCircle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
	
	

}
