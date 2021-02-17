package com.shakal.rpg.api.model.combatstate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_player_state")
public class PlayersState {

	@Id
	private long storyId;
	
	@Column(length=15000)
	private String playersStateJSON;
	
	public PlayersState() {
		
	}
	public PlayersState(long id, String playersStateJSON) {
		this.storyId = id;
		this.playersStateJSON = playersStateJSON;
	}
	
	public long getStoryId() {
		return storyId;
	}

	public void setStoryId(long storyId) {
		this.storyId = storyId;
	}
	public String getPlayersStateJSON() {
		return playersStateJSON;
	}
	public void setPlayersStateJSON(String playersStateJSON) {
		this.playersStateJSON = playersStateJSON;
	}

	
}
