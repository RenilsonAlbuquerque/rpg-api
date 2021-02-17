package com.shakal.rpg.api.dto.edit;

import java.util.List;

import com.shakal.rpg.api.dto.commons.KeyValueDTO;

public class UserManagementUpdateDTO {

	private long storyId;
	private List<KeyValueDTO> users;
	
	public long getStoryId() {
		return storyId;
	}
	public void setStoryId(long storyId) {
		this.storyId = storyId;
	}
	public List<KeyValueDTO> getUsers() {
		return users;
	}
	public void setUsers(List<KeyValueDTO> users) {
		this.users = users;
	}
	
	
	
	
}
