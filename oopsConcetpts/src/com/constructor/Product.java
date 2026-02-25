package com.constructor;

public class Product {

	
	// Constructor chaining
	
	void m1()
	{
		System.out.println("m1");
		m2();
	}
	
	void m2()
	{
		System.out.println("m2");
		m3();
	}
	
	void m3()
	{
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.m1();
	}
}
