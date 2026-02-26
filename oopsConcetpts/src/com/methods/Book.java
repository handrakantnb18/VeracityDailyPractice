package com.methods;

public class Book {

	
	// static method
	// non-instance method
	
	static void add()
	{
		int a = 500;
		int b = 200;
		int c = a + b;
		System.out.println(c);
	}
	
	// instance method
	
	void mul()
	{
		int a = 50;
		int b = 10;
		System.out.println("Multilpication is : "+(a * b));
		
	}
	
	public static void main(String[] args) {
		
		Book.add();
		Book.add();
		
		Book.add();
		
		Book b1 = new Book();
		b1.mul();
		
		Book b2 = new Book();
		b2.mul();
		
	}
}
