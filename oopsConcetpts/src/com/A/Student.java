package com.A;

public class Student {

	// public access modifiers we can use with class, variable, method, constructor
	
	// access by id different packages
	
	public int id = 18;
	
	
	// protected variable, method, constructor allow to access 
	
	// protected int id = 18;
	
	// default modifiers access only same package not outside package
	
	// int id = 18;
	
	// constructor access by using public keyword same package and import package
	
	public Student()
	{
		
	}
	
	// protected
	
//	protected Student()
//	{
//		
//	}
//	
	
	// method call acces public same package and import package
	
	public void m1()
	{
		
	}
	
	// protected
//	protected void m1()
//	{
//		
//	}
//	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println(s1.id);
		
		s1.m1();
	}
}
