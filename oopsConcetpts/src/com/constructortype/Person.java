package com.constructortype;


// Parameterized constructor - A constructor that has parameters is known as parameterized constructor
// if we want to initialize fields of the class with our value, then use a parameterized constructor

public class Person {

	String name;
	int id;
	
	Person(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	void display()
	{
		System.out.println("Name : "+name + " and Id is : "+id);
	}
	public static void main(String[] args) {
		Person p = new Person("Chandrakant", 18);
		p.display();
		
	}
}
