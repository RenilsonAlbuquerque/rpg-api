package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.weapon.WeaponRange;

public interface WeaponRangeDAO  extends JpaRepository<WeaponRange,Long>  {

}
