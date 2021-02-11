package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.character.CharacterClassLevel;


public interface CharacterClassLevelDAO extends JpaRepository<CharacterClassLevel,Long>{

	@Modifying
	@Query("DELETE FROM CharacterClassLevel ccl where ccl.character.id = ?1")
	void deleteAllClassLevelsOfCharacter(long characterId);
}
