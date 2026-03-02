package com.compiletimepolymorphism;

public class Student {

	
	// simple polymorphism prigram
	// if cl.ass having two or more methods with the same name but different parameters
//	
//	void study()
//	{
//		System.out.println("Student doing study using mobile");
//	}
//	
//	void study(int i)
//	{
//		System.out.println("Student doing study using laptop");
//	}
//	
//	void study(int i, int j)
//	{
//		System.out.println("Student doing study using tab");
//	}
//	
//	
	// type of parameter different
	
//	void study(int i)
//	{
//		System.out.println("Type of parameter int");
//	}
//	
//	void study(String a)
//	{
//		System.out.println("Type of parameter String");
//	}
	
	// Sequence of parameter is different
	
	void study(int i, String a)
	{
		System.out.println("Sequence of parameter is diffrent");
	}
	
	void study(String a, int i)
	{
		System.out.println("Sequence changed");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.study();
//		s1.study(18);
//		s1.study(13, 06);
		
//		s1.study(18);
//		s1.study("ABC");
//    
		
		s1.study(18, "Chandraknt");
		s1.study("Bhosale", 06);
	}
}
