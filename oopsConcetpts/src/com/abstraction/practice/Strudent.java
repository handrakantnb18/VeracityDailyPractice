package com.abstraction.practice;

abstract class Strudent {

	int id = 101;
	
	
	void work()
	{
		System.out.println("Abstract method completed");
	}
	
	abstract void login(String studentname);
	
	abstract void register(String studentname);
	
	abstract void book(String auther);
	
	
	// constructor 
	
	Strudent()
	{
		
	}
	// method
	void add()
	{
		
	}
	
	
//	public static void main(String[] args) {
//		
//		Student s1 = new Student();
//		
//	}
}
