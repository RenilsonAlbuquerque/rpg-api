package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.combatstate.PlayersState;

public interface PlayersStateDAO extends JpaRepository<PlayersState,Long>{

}
