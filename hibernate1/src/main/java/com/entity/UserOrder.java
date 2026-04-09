package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
// @Table(name = "Order_info")
@Table(name = "Orders")
public class UserOrder {

	@Id
	private int id;
	
	private String name;
	
	private double price;
	
	private int qty;
	
	
}
