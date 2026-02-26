package com.constructor;

public class Book {

	// constructor calling method
	
	Book()
	{
		this(18); // this call 
		System.out.println("0 Parameterized constructor");
	}
	
	Book(int a)
	{
		this(18, 06);
		System.out.println("1 parameterized constructor");
	}
	
	Book(int a, int b)
	{
		System.out.println("2 Parameterized constructor.");
	}
	
	public static void main(String[] args) {
		
		new Book();
		
		// new Book(18);
		
		// new Book(18, 06);
		
	}
}
