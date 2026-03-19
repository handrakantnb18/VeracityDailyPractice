package com.hashset;

public class Users {

	private int userId;
	
	private String userName;
	
	private String password;
	
	private String city;
	
	private String email;

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", city=" + city
				+ ", email=" + email + "]";
	}

	public Users(int userId, String userName, String password, String city, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.city = city;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
