package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.relation.WeaponDice;

public interface WeaponDiceDAO extends JpaRepository<WeaponDice,Long>{

}
