package com.shakal.rpg.api.model.place;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shakal.rpg.api.model.Place;

@Entity
@Table(name= "tb_place_wall")
public class PlaceWall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int startPositionX;
	private int startPositionY;
	private int endPositionX;
	private int endPositionY;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Place.class)
	@JoinColumn(name ="place_id", referencedColumnName = "id")
	private Place place;
	
	public int getStartPositionX() {
		return startPositionX;
	}
	public void setStartPositionX(int startPositionX) {
		this.startPositionX = startPositionX;
	}
	public int getStartPositionY() {
		return startPositionY;
	}
	public void setStartPositionY(int startPositionY) {
		this.startPositionY = startPositionY;
	}
	public int getEndPositionX() {
		return endPositionX;
	}
	public void setEndPositionX(int endPositionX) {
		this.endPositionX = endPositionX;
	}
	public int getEndPositionY() {
		return endPositionY;
	}
	public void setEndPositionY(int endPositionY) {
		this.endPositionY = endPositionY;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	
	

}
