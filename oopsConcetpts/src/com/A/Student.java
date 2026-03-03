package com.A;

public class Student {

	// public access modifiers we can use with class, variable, method, constructor
	
	// access by id different packages
	
	public int id = 18;
	
	// constructor access by using public keyword same package and import package
	
	public Student()
	{
		
	}
	
	// method call acces public same package and import package
	
	public void m1()
	{
		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println(s1.id);
		
		s1.m1();
	}
}
