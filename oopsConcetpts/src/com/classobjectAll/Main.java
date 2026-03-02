package com.classobjectAll;


// class is blueprint  that defines data and behaviour for objects.
// Does not occupy memory for fields unit installation
// can contain fields, methods, constructors, nested classes and interfaces

class Student 
{
	int id;
	String n;
	
	public Student(int id, String n)
	{
		this.id = id;
		this.n = n;
	}
}

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Chandrakant");
		System.out.println(s1.id);
		System.out.println(s1.n);
	}
}
