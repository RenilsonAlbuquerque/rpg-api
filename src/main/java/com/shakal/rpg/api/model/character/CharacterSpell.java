package com.shakal.rpg.api.model.character;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tb_character_spell")
public class CharacterSpell {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int spellSaveDC;
	private int spellBonusAttack;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Character character;
	
	@OneToMany(mappedBy = "characterSpell",fetch = FetchType.EAGER)
	private List<CharacterSpellCircle> spells;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

}
