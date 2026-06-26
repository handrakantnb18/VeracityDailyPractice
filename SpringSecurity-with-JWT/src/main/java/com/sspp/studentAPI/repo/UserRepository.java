package com.sspp.studentAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sspp.studentAPI.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
