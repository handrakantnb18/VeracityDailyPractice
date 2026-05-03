package com.codingInterviewQThree;

public class User {

	private int id;
	
	private String username;
	
	private String password;
	
	private String city;

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", city=" + city + "]";
	}

	public User(int id, String username, String password, String city) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
		
}
