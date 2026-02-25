package com.classandobject;

public class Demo {

	
	// variables
	
	int a = 20;
	int id = 101;
	
	String name = "Chandrakant";
	
	static String collageName = "Chatrapati shivaji maharaj collage sangli"; // static variable
	
	// instance variable
	
	int age = 25;
	String fName= "Vijay";
	 
	void add()  // method
	{
		// local variable
		
		int a = 10;
		System.out.println(a);
	}
	
	
	void add(int a)
	{
		a = 10;
	}
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		System.out.println(collageName); // static variable
		
		// instance variable
		System.out.println(demo.age);
		System.out.println(demo.fName);
		
		// local variable
		// System.out.println(a);
	}
}
