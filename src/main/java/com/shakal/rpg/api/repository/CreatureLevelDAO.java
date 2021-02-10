package com.shakal.rpg.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.CreatureLevel;

public interface CreatureLevelDAO  extends JpaRepository<CreatureLevel,Long>{

	@Query("SELECT cl FROM CreatureLevel cl where cl.id > 3")
	List<CreatureLevel> retrieveCharacterLevels();
}
