package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.equipament.weapon.WeaponClassification;

public interface WeaponClassificationDAO  extends JpaRepository<WeaponClassification,Long>{

}
