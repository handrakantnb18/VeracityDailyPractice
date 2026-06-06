package com.sspp.studentAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private Integer id;
	
	private String name;
	
	private Double price;
	
	private Integer qty;
	
	private String imageName;
	
	
}
