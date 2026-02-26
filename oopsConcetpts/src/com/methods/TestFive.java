package com.methods;

public class TestFive {

	// static method
	
	String fname;
	String lname;
	
	static void display() // static method
	{
		System.out.println("This is static method");
	}
	
	// instance method
	
	void show()
	{
		System.out.println("Instance method");
	}
//	void show(String fname, String lname)
//	{
//		System.out.println("Instance method.");
//		this.fname = fname;
//		this.lname =  lname;
//		System.out.println();
//	}
	
	
	public static void main(String[] args) {
	
		TestFive t5 = new TestFive();
		
		TestFive.display();
		
		TestFive.display();
		TestFive.display();
		TestFive.display();
		
		t5.show();
		
		TestFive f6 = new TestFive();
		// String s1 = f6.show();
		
	}
}
