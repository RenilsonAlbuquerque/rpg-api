package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.equipament.armor.Armor;

public interface ArmorDAO extends JpaRepository<Armor,Long>{

}
