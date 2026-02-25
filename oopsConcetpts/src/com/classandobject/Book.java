package com.classandobject;

public class Book {

	
	// static variable
	static String univercityName = "pune university";
	
	// instance variable
	
	int id = 101;
	String fName = "Chandrakant";
	
	
	void dispay()  // method
	{
		int a = 10;
		
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		Book book = new Book();
		// static variable
		
		System.out.println(univercityName);
		
		
		// instance variable
		
		System.out.println(book.id);
		System.out.println(book.fName);
		
		Book book2 = new Book();
		
		//int a = 20;
		
		System.out.println(book2.id);
		// System.out.println(a);
		
		//System.out.println(a);
	}
}
