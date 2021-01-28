package com.shakal.rpg.api.dto.info;

import java.util.List;

public class CharacterSpellDTO {
	
	private long id;
	private int spellSaveDC;
	private int spellBonusAttack;
	private List<CreatureSpellInfoDTO> spells;
	
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
	public List<CreatureSpellInfoDTO> getSpells() {
		return spells;
	}
	public void setSpells(List<CreatureSpellInfoDTO> spells) {
		this.spells = spells;
	}
	
	

}
