package com.abstraction.practice;

abstract class Payment {

	// instance variable
	//int id = 10;
	
	//static String collageName = "Abc";
	
	void payment()
	{
		System.out.println("Abstract method");
	}
	
	abstract void Login(double amount);
	
	abstract void register(double amount);
	
	abstract void work(String name);
	
	// constructor
//	Payment()
//	{
//		
//	}
//	
	// instance method
	
//	void add()
//	{
//		
//	}
	
	
	// can not create object abstact class
	
//	public static void main(String[] args) {
//		Payment p = new Payment();
//		
//	}
}
