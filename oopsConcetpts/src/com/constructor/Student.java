package com.constructor;

public class Student {

	// constructor
	
	Student()
	{
		System.out.println("Hello Chandrakant.");
	}
	
	void show()
	{
		System.out.println("show method.");
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(); // object with reference variable
		
		new Student(); // object  without reference variable
		// anonymos object -> object  without name is called anonyms object
		s1.show();
	}
}
