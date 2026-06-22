package com.sspp.studentAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sspp.studentAPI.entity.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByName(String name);
	
}
