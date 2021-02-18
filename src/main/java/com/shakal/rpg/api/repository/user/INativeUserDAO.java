package com.shakal.rpg.api.repository.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.user.NativeUser;
import com.shakal.rpg.api.model.user.User;

public interface INativeUserDAO extends JpaRepository<NativeUser,Long>{

	/*
	@Query("SELECT us FROM NativeUser us FETCH ALL PROPERTIES where us.useraname = ?1")
	Optional<NativeUser> findUserByUsername(String username);
	*/
	Optional<NativeUser> findByUsername(String username);
}
