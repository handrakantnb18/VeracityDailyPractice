package com.hashset;

import java.util.HashSet;

public class UsersDemo {

	public static void main(String[] args) {
		
		HashSet<Users> hs = new HashSet<Users>();
		hs.add(new Users(1, "chandrakant", "123456", "Pune", "chandrakant@gmail.com"));
		hs.add(new Users(2, "ram", "ram", "mumbai", "ram12@gmail.com"));
		
		
		System.out.println(hs);
	}
}
