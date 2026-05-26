package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Repository
@Entity

public class Employee {

	@Id
	
	private int id;
	
	private String name;
	
	private  String city;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
