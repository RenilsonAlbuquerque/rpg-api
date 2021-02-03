package com.shakal.rpg.api.model.enums;

public enum EquipmentTypeEnum {

	WEAPON(1),ARMOR(2),TOOL(3),MOUNT(4);
	
	private int value;
	
	private EquipmentTypeEnum (int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
