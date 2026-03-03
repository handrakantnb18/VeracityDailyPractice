package com.C;

public class Demo {

	// final instance variable need to assign value for variable
	
	final String name = "Chandrakant";
	public static void main(String[] args) {
		
		// final variable can not access other variables
		
		final int id = 111;
		
		System.out.println(id);
		
		// id = 123;
		
		// System.out.println(id);
	}
}
