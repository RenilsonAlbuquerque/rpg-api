package com.shakal.rpg.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.place.PlaceWall;

public interface PlaceWallDAO extends JpaRepository<PlaceWall,Long> {
	
	@Modifying
	@Query("delete from PlaceWall pw where pw.place.id= ?1")
	void deletePlacesWallsByPlaceId(long placeId);
	
}
