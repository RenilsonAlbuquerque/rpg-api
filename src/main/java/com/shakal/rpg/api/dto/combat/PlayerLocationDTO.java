package com.shakal.rpg.api.dto.combat;

public class PlayerLocationDTO {
	
	private long playerId;
	private long characterId;
	private long placeId;
	private long floorId;
	
	public PlayerLocationDTO() {
		
	}
	public PlayerLocationDTO(long playerId,long characterId,long placeId, long floorId) {
		this.playerId = playerId;
		this.characterId = characterId;
		this.placeId = placeId;
		this.floorId = floorId;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	
	public long getCharacterId() {
		return characterId;
	}
	public void setCharacterId(long characterId) {
		this.characterId = characterId;
	}
	public long getPlaceId() {
		return placeId;
	}
	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}
	public long getFloorId() {
		return floorId;
	}
	public void setFloorId(long floorId) {
		this.floorId = floorId;
	}
	
	

}
