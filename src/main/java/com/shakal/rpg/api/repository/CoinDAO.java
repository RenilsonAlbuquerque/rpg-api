package com.shakal.rpg.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakal.rpg.api.model.economy.Coin;

public interface CoinDAO extends JpaRepository<Coin,Long> {

}
