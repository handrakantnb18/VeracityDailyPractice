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
	
	private String catagory;

	public Product(Integer id, String name, Double price, Integer qty, String catagory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.catagory = catagory;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
