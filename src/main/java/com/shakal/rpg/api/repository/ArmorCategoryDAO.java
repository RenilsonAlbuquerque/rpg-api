package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.equipament.armor.ArmorCategory;


public interface ArmorCategoryDAO extends JpaRepository<ArmorCategory,Long> {

}
