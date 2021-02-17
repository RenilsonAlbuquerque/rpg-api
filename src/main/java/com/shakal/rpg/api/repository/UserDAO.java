package com.shakal.rpg.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shakal.rpg.api.model.User;

public interface UserDAO extends JpaRepository<User,Long> {

	Optional<User> findByUsername(String username);
	
	
	@Query("SELECT us FROM User us FETCH ALL PROPERTIES where us.id != ?1")
	List<User> retrieveAllUsersExceptId(long userId);
}
