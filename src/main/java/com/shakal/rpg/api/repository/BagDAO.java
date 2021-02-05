package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.character.Bag;

public interface BagDAO extends JpaRepository<Bag,Long> {

	@Query("SELECT bg FROM Bag bg FETCH ALL PROPERTIES where bg.character.id = ?1")
	Bag getCharacterBagByCharacterId(long characterId);
}
