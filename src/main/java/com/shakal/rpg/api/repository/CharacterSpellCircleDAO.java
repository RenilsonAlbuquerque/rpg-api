package com.shakal.rpg.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.character.CharacterSpellCircle;

public interface CharacterSpellCircleDAO extends JpaRepository<CharacterSpellCircle,Long> {

	/*
	@Query("SELECT csc FROM CharacterSpellCircle csc FETCH ALL PROPERTIES where csc.character.id = ?1")
	List<CharacterSpellCircle> getAllCharacterSpellCircleByCharacterId(long characterId);
	*/

}
