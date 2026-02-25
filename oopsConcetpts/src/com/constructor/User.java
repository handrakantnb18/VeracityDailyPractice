package com.constructor;

public class User {

	
	// parameterized constructor is created username, password, email
	
	String username;
	String password;
	String email;
	int age = 0;
	
	User(String username, String password, String email, int age)
	{
		this.username = username;
		
		if (password.length() >= 5)
		{
			this.password = password;
		}
		else
		{
			this.password = "Invalid password";
		}
		// this.password = password;
		
		if(email.contains("@"))
		{
			this.email = email;
		}
		else
		{
			this.email = "Invalid email";
		}
		// this.email = email;
		if(age >= 18 )
		{
			this.age = age;
		}
		else
		{
			this.age = 0;
		}
		
		// this.age = age;
		show();
	}
	
	void show()
	{
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		System.out.println("Email : "+email);
		System.out.println("Age : "+age);
		System.out.println("----------------------------------");
		
	}
	public static void main(String[] args) {
		// User u1 = new User("chandrakant", "123456", "chandr@gmail.com");
		// u1.show();
		
		new User("chandrakant", "123456", "chandr@gmail.com", 12);
		
		new User("vijay", "987654", "vijay@gmail.com", 25);
		
		new User("ram", "987654", "ram.gmail.com", 55);
		
	}
}
