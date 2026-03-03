package com.C;

public class Demo {

	// final instance variable need to assign value for variable
	// final can not change once declared, class not accessible, variable not override other class and package
	
	
	final String name = "Chandrakant";
	
	
	// method final then we can not access / override
	
	final void house()
	{
		System.out.println("1 BHK");
	}
	
	public static void main(String[] args) {
		
		// final variable can not access other variables
		
		final int id = 111;
		
		System.out.println(id);
		
		// id = 123;
		
		// System.out.println(id);
	}
}
