package com.entity;

public class User {

	private String name;
	
	private String email;
	
	private String password;
	
	private String gender;
	
	private String city;

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender + ", city="
				+ city + "]";
	}
	
	
	
}
