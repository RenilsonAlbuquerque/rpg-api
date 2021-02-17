package com.shakal.rpg.api.model.combatstate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_combat_state")
public class CombatState {
	
	@Id
	private long placeId;
	
	@Column(length=15000)
	private String combatStateJSON;

	public CombatState() {
		
	}
	public CombatState(long id, String combatStateJson) {
		this.placeId = id;
		this.combatStateJSON = combatStateJson;
	}
	

	public long getPlaceId() {
		return placeId;
	}
	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}
	public String getCombatStateJSON() {
		return combatStateJSON;
	}

	public void setCombatStateJSON(String combatStateJSON) {
		this.combatStateJSON = combatStateJSON;
	}
	
	

}
