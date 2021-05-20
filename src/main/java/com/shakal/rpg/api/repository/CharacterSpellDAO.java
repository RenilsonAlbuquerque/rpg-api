package com.shakal.rpg.api.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.character.CharacterSpell;

public interface CharacterSpellDAO extends JpaRepository<CharacterSpell,Long> {

	@Query("SELECT cs FROM CharacterSpell cs FETCH ALL PROPERTIES where cs.character.id = ?1")
	List<CharacterSpell> getCharacterSpellByCharacterId(long characterId);
	
	@Query("SELECT cs FROM CharacterSpell cs FETCH ALL PROPERTIES where cs.character.id = ?1 and cs.id = ?2")
	Optional<CharacterSpell> getCharacterSpellByCharacterIdAndId(long characterId, long spellId);
}
