package com.sspp.studentAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sspp.studentAPI.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
}
