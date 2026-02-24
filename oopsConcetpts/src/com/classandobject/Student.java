package com.classandobject;

public class Student {

	// variables 
	
//	int id = 1;
//	String name = "Chandrakant";
//	
	// function
	
	int id;
	String name;
	
	void add()
	{
		System.out.println("Add method.");
	}
	
	public static void main(String[] args) {
		
		// create object  
		// we will create multiple objects in single class
		
		Student s1 = new Student();
		// memory address find
		s1.id = 101;
		s1.name = "Chandra";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		System.out.println();
		Student s2 = new Student();
		s2.id = 102;
		s2.name = "Priyanka";
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		System.out.println();
		Student s3 = new Student();
		s3.id = 103;
		s3.name = "Bhosale";
		System.out.println(s3.id);
		System.out.println(s3.name);
		
		
	}
}
