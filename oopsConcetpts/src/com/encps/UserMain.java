package com.encps;

public class UserMain {

	
	public static void main(String[] args) {
		
		User u1 = new User();
		
		u1.setUsername("chandrakant");
		System.out.println(u1.getUsername());
		
		u1.setPassword("181818");
		System.out.println(u1.getPassword());
		
		u1.setAddress("Pune");
		System.out.println(u1.getAddress());
		
		u1.setMobileno("9876543210");
		System.out.println(u1.getMobileno());
		
	}
}
