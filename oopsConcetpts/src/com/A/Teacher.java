package com.A;

public class Teacher {

	// object access by same package but different class
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		// accessed different class variables
		
		System.out.println(s1.id);
		
		// access same package object call
		
		s1.m1();
	}
}
