package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserOrder {

	@Id
	private int id;
	
	private String name;
	
	private double price;
	
	private int qty;
	
	
}
