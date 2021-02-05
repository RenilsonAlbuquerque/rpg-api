package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.equipament.weapon.WeaponProperty;

public interface WeaponPropertyDAO extends JpaRepository<WeaponProperty,Long>{

}
