package com.shakal.rpg.api.model.user;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.shakal.rpg.api.model.relation.UserStory;



@Entity
@Table(name= "tb_user")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String username;
	
	
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY, targetEntity = UserStory.class)
	private List<UserStory> stories;
	
	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	
	public List<UserStory> getStories() {
		return stories;
	}

	public void setStories(List<UserStory> stories) {
		this.stories = stories;
	}

	
	
	
	
	
	
	
}
