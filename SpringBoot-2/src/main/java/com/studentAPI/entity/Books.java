package com.studentAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	private Integer id;
	
	private String name;
	
	private Double price;
	
	private Integer qty;
	
	
}
