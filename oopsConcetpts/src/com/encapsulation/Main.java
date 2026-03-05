package com.encapsulation;

public class Main {

	public static void main(String[] args) {
		User u = new User();
//		u.username = "Chandrakant"; // direct access denied
//		u.password = "1818"; // direct access denied
		
		/*
		 * System.out.println(u.username); // direct access denied
		 */
		
		u.setUsername("Chandraaknt");
		System.out.println(u.getUsername()); // access via getter method
		
		u.setPassword("181818");
		System.out.println(u.getPassword());
		
	}
}
