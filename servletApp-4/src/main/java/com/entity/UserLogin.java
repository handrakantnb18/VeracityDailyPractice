package com.entity;

public class UserLogin {

	private String name;
	
	private String password;

	// toString method
	@Override
	public String toString() {
		return "USerLogin [name=" + name + ", password=" + password + "]";
	}

	// Constructor
	public UserLogin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	// getter and setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
