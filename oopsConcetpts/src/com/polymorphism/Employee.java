package com.polymorphism;

public class Employee extends User {

	
	void login()
	{
		super.login();
		System.out.println("2. user login");
	}
	
	void register()
	{
		super.register();
		System.out.println("2. register form");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.login();
		e.register();
		
		//User u = new User();
		// u.login();
	}
}
