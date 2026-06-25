package com.sspp.studentAPI.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sspp.studentAPI.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);

	
}
