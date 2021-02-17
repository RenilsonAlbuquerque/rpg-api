package com.shakal.rpg.api.dto.combat;

import java.util.List;

public class PlayersStateDTO {

	private List<CreatureCardDTO> players;

	public PlayersStateDTO() {
		
	}
	public PlayersStateDTO(List<CreatureCardDTO> players) {
		this.players = players;
	}
	public List<CreatureCardDTO> getPlayers() {
		return players;
	}

	public void setPlayers(List<CreatureCardDTO> players) {
		this.players = players;
	} 
	
	
	
}
