package com.sspp.studentAPI.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private Integer id;
	
	private String name;
	
	private Double price;
	
	private Integer qty; 
	
	private String catagory;

	
}
