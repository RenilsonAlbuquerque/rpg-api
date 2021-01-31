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

import com.shakal.rpg.api.model.character.Character;

@Entity
@Table(name= "tb_character_spell")
public class CharacterSpell {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int spellSaveDC;
	private int spellBonusAttack;
	
	@OneToOne(targetEntity = Character.class)
	@JoinColumn(name ="character_id")
	private Character character;
	
	@OneToMany(mappedBy = "characterSpell",fetch = FetchType.LAZY, cascade = CascadeType.ALL,targetEntity = CharacterSpellCircle.class)
	private List<CharacterSpellCircle> spells;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSpellSaveDC() {
		return spellSaveDC;
	}

	public void setSpellSaveDC(int spellSaveDC) {
		this.spellSaveDC = spellSaveDC;
	}

	public int getSpellBonusAttack() {
		return spellBonusAttack;
	}

	public void setSpellBonusAttack(int spellBonusAttack) {
		this.spellBonusAttack = spellBonusAttack;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public List<CharacterSpellCircle> getSpells() {
		return spells;
	}

	public void setSpells(List<CharacterSpellCircle> spells) {
		this.spells = spells;
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
		CharacterSpell other = (CharacterSpell) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
