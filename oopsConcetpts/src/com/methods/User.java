package com.methods;

public class User {

	// create simple username password and email for biginer
	String username;
	String password;
	String email;
	
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.username = "Chandrakant";
		user1.password = "123456";
		user1.email = "chandrakant@hmail.com";
		
		System.out.println(user1.username);
		System.out.println(user1.password);
		System.out.println(user1.email);
		
		System.out.println("--------------------------");
		User user2 = new User();
		user2.username = "Vijay";
		user2.password = "987654";
		user2.email = "vijay@gmail.com";
		
		
		System.out.println(user2.username);
		System.out.println(user2.password);
		System.out.println(user2.email);
		
		System.out.println("==========================");
		User user3 = new User();
		user3.username = "Ram";
		user3.password = "987123";
		user3.email = "ram@gmail.com";
		
		System.out.println(user3.username);
		System.out.println(user3.password);
		System.out.println(user3.email);
		
	}
}
