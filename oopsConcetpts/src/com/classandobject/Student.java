package com.classandobject;

public class Student {

	// variables 
	
	int id = 1;
	String name = "Chandrakant";
	
	// function
	
	void add()
	{
		
	}
	
	public static void main(String[] args) {
		
		// create object  
		// we will create multiple objects in single class
		
		Student s1 = new Student();
		// memory address find
		
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println(s2);
		
		Student s3 = new Student();
		System.out.println(s3);
		
		
	}
}
