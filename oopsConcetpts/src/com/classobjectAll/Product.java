package com.classobjectAll;

public class Product {

	// Every class has at least one constructor. if none is defined java provides a default
	// no-arguments constructor that class the parent constructor
	
	static String name;
	static float price;
	
	static void set(String n, float p)
	{
		name = n;
		price = p;
	}
	
	static void get()
	{
		System.out.println("Software name is : "+name);
		System.out.println("Software is price : "+price);
	}
	
	public static void main(String[] args) {
		Product.set("JDK Java", 50.05f);
		Product.get();
	}
}
