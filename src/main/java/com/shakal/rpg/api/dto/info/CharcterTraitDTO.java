package com.shakal.rpg.api.dto.info;


public class CharcterTraitDTO {

	private long id;
	private String personality;
	private String ideals;
	private String bonds;
	private String flaws;
	private String featuresFeatsEquipmentsNotes;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPersonality() {
		return personality;
	}
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	public String getIdeals() {
		return ideals;
	}
	public void setIdeals(String ideals) {
		this.ideals = ideals;
	}
	
	public String getBonds() {
		return bonds;
	}
	public void setBonds(String bonds) {
		this.bonds = bonds;
	}
	public String getFlaws() {
		return flaws;
	}
	public void setFlaws(String flaws) {
		this.flaws = flaws;
	}
	public String getFeaturesFeatsEquipmentsNotes() {
		return featuresFeatsEquipmentsNotes;
	}
	public void setFeaturesFeatsEquipmentsNotes(String featuresFeatsEquipmentsNotes) {
		this.featuresFeatsEquipmentsNotes = featuresFeatsEquipmentsNotes;
	}
	
	
	
}
