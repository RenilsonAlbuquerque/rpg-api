package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.equipament.tool.Tool;

public interface ToolDAO extends JpaRepository<Tool,Long>{

}
