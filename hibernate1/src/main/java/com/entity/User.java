package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private String id; // can not insert duplicate value and null value
	
	private String username;
	
	private String password;
	
	private String address;
	
	
	
}
