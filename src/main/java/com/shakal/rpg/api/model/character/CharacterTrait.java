package com.shakal.rpg.api.model.character;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tb_character_trait")
public class CharacterTrait {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(length = 400)
	private String personality;
	@Column(length = 400)
	private String ideals;
	@Column(length = 400)
	private String bonds;
	@Column(length = 400)
	private String flaws;
	
	@Column(length = 3000)
	private String featuresFeatsEquipmentsNotes;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="character_id")
	private Character character;

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

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}
	
	

}
