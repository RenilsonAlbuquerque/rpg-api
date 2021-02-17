package com.shakal.rpg.api.dto.combat;

public class ChangeCharcterLocationDTO {
	
	private long characterId;
	private long currentPlaceId;
	private long storyId;
	
	public long getCharacterId() {
		return characterId;
	}
	public void setCharacterId(long characterId) {
		this.characterId = characterId;
	}
	public long getCurrentPlaceId() {
		return currentPlaceId;
	}
	public void setCurrentPlaceId(long currentPlaceId) {
		this.currentPlaceId = currentPlaceId;
	}
	public long getStoryId() {
		return storyId;
	}
	public void setStoryId(long storyId) {
		this.storyId = storyId;
	}
	
	
	
	

}
