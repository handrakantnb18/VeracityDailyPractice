package com.constructor;

public class User {

	
	// parameterized constructor is created username, password, email
	
	String username;
	String password;
	String email;
	
	
	User(String username, String password, String email)
	{
		this.username = username;
		this.password = password;
		this.email = email;
		show();
	}
	
	void show()
	{
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		System.out.println("Email : "+email);
		
	}
	public static void main(String[] args) {
		// User u1 = new User("chandrakant", "123456", "chandr@gmail.com");
		// u1.show();
		
		new User("chandrakant", "123456", "chandr@gmail.com");
		
		new User("vijay", "987456", "vijay@gmail.com");
		
	}
}
