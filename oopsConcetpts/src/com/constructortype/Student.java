package com.constructortype;

// Copy constructor - is passed with another object which copies the data available form the passed object to the newly created object

class PersonTen
{
	String name;
	int id;
	
	PersonTen(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	PersonTen(PersonTen obj)
	{
		this.name = obj.name;
		this.id = obj.id;
	}

}
public class Student {

	public static void main(String[] args) {
		
		System.out.println("First Object : ");
		PersonTen p1 = new PersonTen("Chandrakant", 18);
		
		System.out.println("Person name : "+p1.name +" and Person Id : "+p1.id);
		
		System.out.println();
		
		PersonTen p2 = new PersonTen(p1);
		System.out.println("Copy constructor used second object ");
		
		System.out.println("Person name : "+p2.name + " and Person Id : "+p2.id);
		
	}
	
	}


