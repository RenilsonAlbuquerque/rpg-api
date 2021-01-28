package com.shakal.rpg.api.model.embedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CharacterSpellCircleId implements Serializable {

	@Column(name = "character_Id")
    private Long characterId;
	
	@Column(name = "spellCircle")
    private Short spellCircle;

	public Long getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Long characterId) {
		this.characterId = characterId;
	}

	

	public Short getSpellCircle() {
		return spellCircle;
	}

	public void setSpellCircle(Short spellCircle) {
		this.spellCircle = spellCircle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((characterId == null) ? 0 : characterId.hashCode());
		result = prime * result + ((spellCircle == null) ? 0 : spellCircle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharacterSpellCircleId other = (CharacterSpellCircleId) obj;
		if (characterId == null) {
			if (other.characterId != null)
				return false;
		} else if (!characterId.equals(other.characterId))
			return false;
		if (spellCircle == null) {
			if (other.spellCircle != null)
				return false;
		} else if (!spellCircle.equals(other.spellCircle))
			return false;
		return true;
	}
	
	
}
