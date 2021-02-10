package com.shakal.rpg.api.dto.create;

import java.util.List;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;

public class CharacterHeaderInputDTO {

	private List<KeyValueDTO> levels;
	private List<KeyValueDTO> classes;
	public List<KeyValueDTO> getLevels() {
		return levels;
	}
	public void setLevels(List<KeyValueDTO> levels) {
		this.levels = levels;
	}
	public List<KeyValueDTO> getClasses() {
		return classes;
	}
	public void setClasses(List<KeyValueDTO> classes) {
		this.classes = classes;
	}
	

	
	
}
