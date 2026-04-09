package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private int id; // can not insert duplicate value and null value
	
	private String username;
	
	private String password;
	
	private String address;

	
	public User(int id, String username, String password, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address + "]";
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
