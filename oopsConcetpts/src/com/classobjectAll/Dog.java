package com.classobjectAll;

public class Dog {

	// An object is an instance of a class created to access its data and operations. 
	
	
	String name;
	String breed;
	int age;
	String color;
	
	public Dog(String name, String breed, int age, String color)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String toString()
	{
		return " Name is : " + name + " \nBread age and color are :"
				+breed + " "+ age + " " + color;
	}
	
	public static void main(String[] args) {
		Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
		System.out.println(tuffy);
	}
}
