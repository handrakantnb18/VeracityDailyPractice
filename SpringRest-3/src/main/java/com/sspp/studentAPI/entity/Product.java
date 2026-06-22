package com.sspp.studentAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Product {

	@Id
	private Integer id;
	
	private String name;
	
	private Double price;
	
	private Integer qty; 
	
	private String catagory;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
