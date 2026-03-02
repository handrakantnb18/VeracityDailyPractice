package com.compiletimepolymorphism;

public class Student {

	
	// simple polymorphism prigram
	// if class having two or more methods with the same name but different parameters
	
	void study()
	{
		System.out.println("Student doing study using mobile");
	}
	
	void study(int i)
	{
		System.out.println("Student doing study using laptop");
	}
	
	void study(int i, int j)
	{
		System.out.println("Student doing study using tab");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.study();
		s1.study(18);
		s1.study(13, 06);
	}
}
