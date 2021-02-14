package com.shakal.rpg.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.place.Place;

public interface PlaceDAO extends JpaRepository<Place,Long>{

	@Query("SELECT pl FROM Place pl FETCH ALL PROPERTIES where pl.story.id = ?1")
	List<Place> retrieveAllPlacesInStory(long storyId);
}
