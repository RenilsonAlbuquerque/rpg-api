package com.shakal.rpg.api.dto.combat;

public class PlayerCardDTO extends CreatureCardDTO {

	private long playerId;
	private long placeId;
	
	
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	
	
	public long getPlaceId() {
		return placeId;
	}
	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}
}
