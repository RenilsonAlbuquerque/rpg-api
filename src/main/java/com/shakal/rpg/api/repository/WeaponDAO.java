package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.shakal.rpg.api.model.equipament.weapon.Weapon;

public interface WeaponDAO extends JpaRepository<Weapon,Long> , JpaSpecificationExecutor<Weapon> {

}
