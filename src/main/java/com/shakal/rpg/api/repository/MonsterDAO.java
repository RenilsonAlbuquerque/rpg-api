package com.shakal.rpg.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;

import com.shakal.rpg.api.dto.overview.MonsterOverviewDTO;
import com.shakal.rpg.api.model.Monster;


public interface MonsterDAO extends JpaRepository<Monster,Long>, JpaSpecificationExecutor<Monster> {
	

	@Query("SELECT new com.shakal.rpg.api.dto.overview.MonsterOverviewDTO(m.id, m.challengeLevel.value"
	  		+ ",m.race.name) FROM Monster m FETCH ALL PROPERTIES where (m.confidential = 1 and m.userCreatorId = ?1) or m.confidential = 0")
	  Page<MonsterOverviewDTO> retrieveMonstersAsDTO(Pageable pageable,long playerId);
	
	
	@Query("SELECT m from Monster m FETCH ALL PROPERTIES where (m.confidential = 1 and m.userCreatorId = ?1) or m.confidential = 0")
	  Page<Monster> retrieveAllMyMonsters(Pageable pageable,long playerId);
	
	@Query("SELECT m from Monster m FETCH ALL PROPERTIES where (m.confidential = 1 and m.userCreatorId = ?1) or m.confidential = 0")
	  Page<Monster> retrieveAllMyMonsters(@Nullable Specification<Monster> spec,Pageable pageable,long playerId);
	
	
	
	
	
}
