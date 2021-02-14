package com.shakal.rpg.api.dto.create;

import java.util.List;

public class PlaceCreateDTO {
	private long storyId;
	private String name;
	private String background;
	private String image;	
	private List<FloorCreateDTO> floors;
	

	
	public long getStoryId() {
		return storyId;
	}

	public void setStoryId(long storyId) {
		this.storyId = storyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<FloorCreateDTO> getFloors() {
		return floors;
	}

	public void setFloors(List<FloorCreateDTO> floors) {
		this.floors = floors;
	}

	
	

}
