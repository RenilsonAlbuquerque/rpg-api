package com.shakal.rpg.api.model.character;

public enum CharacterSpellCircleEnum {

	TRICK(0),FIRST(1),SECOND(2),THIRD(3),FOURTH(4),FIFTH(5),SIXTH(6),SEVENTH(7),EIGHTH(8),NINTH(9);
	
	private int value;
	
	
	private CharacterSpellCircleEnum (int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
