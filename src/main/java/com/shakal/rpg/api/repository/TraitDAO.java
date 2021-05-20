package com.shakal.rpg.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.character.CharacterTrait;

public interface TraitDAO  extends JpaRepository<CharacterTrait,Long>{

	@Query("SELECT ct FROM CharacterTrait ct FETCH ALL PROPERTIES where ct.character.id = ?1 and ct.id = ?2")
	Optional<CharacterTrait> getCharacterTraitByCharacterIdAndId(long characterId, long spellId);
	
	@Query("SELECT ct FROM CharacterTrait ct FETCH ALL PROPERTIES where ct.character.id = ?1")
	List<CharacterTrait> getCharacterTraitByCharacterId(long characterId);
}
