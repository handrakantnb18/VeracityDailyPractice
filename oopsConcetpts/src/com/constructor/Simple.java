package com.constructor;

public class Simple {

	int id = 101;
	String name = "Chandrakant";
	String city = "Banglore";
	
	// non-parameterized constructor
	
	Simple()
	{
		
		System.out.println("non-parameterized constructor");
	}
	
	// parameterized constructor
	
	Simple(int id, String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("parameterized constructor");
	}
	
	Simple(String city)
	{
		// super.main(Stiring name, int id);
		this.city = city;
	}
	
	public static void main(String[] args) {
		Simple s = new Simple(); // object
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.city);
	}
}
