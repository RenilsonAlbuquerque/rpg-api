package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shakal.rpg.api.model.equipament.Rarity;

public interface RarityDAO extends JpaRepository<Rarity,Long> {

}
