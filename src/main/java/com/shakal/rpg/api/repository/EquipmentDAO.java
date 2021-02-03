package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.shakal.rpg.api.model.equipament.Equipament;

public interface EquipmentDAO extends JpaRepository<Equipament,Long>, JpaSpecificationExecutor<Equipament>{

}
