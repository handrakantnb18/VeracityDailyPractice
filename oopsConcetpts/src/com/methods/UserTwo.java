package com.methods;

public class UserTwo {

	// create better way username, password and email
	
	String username;
	String password;
	String email;
	
	void set(String username, String password, String email)
	{
		this.username = username;
		this.password = password;
		this.email = email;
		show();
		
	}
	
	void show()
	{
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		System.out.println("Email : "+email);
	}
	
	public static void main(String[] args) {
		
		UserTwo user1 = new UserTwo();
		user1.set("chandrakant", "123456", "chandr@gmail.com");
//		user1.username = "Chandrakant";
//		user1.password = "123456";
//		user1.email = "chandrakant@hmail.com";
//		
//		System.out.println(user1.username);
//		System.out.println(user1.password);
//		System.out.println(user1.email);
//		
		System.out.println("--------------------------");
		UserTwo user2 = new UserTwo();
		user2.set("Vijay", "987654", "vijay@gmail.com");
//		user2.username = "Vijay";
//		user2.password = "987654";
//		user2.email = "vijay@gmail.com";
//		
		
//		System.out.println(user2.username);
//		System.out.println(user2.password);
//		System.out.println(user2.email);
//		
		System.out.println("==========================");
		UserTwo user3 = new UserTwo();
		user3.set("Ram", "987123", "ram@gmail.com");
//		user3.username = "Ram";
//		user3.password = "987123";
//		user3.email = "ram@gmail.com";
//		
//		System.out.println(user3.username);
//		System.out.println(user3.password);
//		System.out.println(user3.email);
//		
	}
}
