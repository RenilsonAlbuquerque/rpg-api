package com.shakal.rpg.api.dto.combat;

public class RemoveCreatureFromCombatDTO {

	private String creatureCombatId;
	private long storyId;
	
	public String getCreatureCombatId() {
		return creatureCombatId;
	}
	public void setCreatureCombatId(String creatureCombatId) {
		this.creatureCombatId = creatureCombatId;
	}
	public long getStoryId() {
		return storyId;
	}
	public void setStoryId(long storyId) {
		this.storyId = storyId;
	}
	
	
}
