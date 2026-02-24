package com.oopsconceptsFirst;

public class Student {

//	int id = 101;
//	String name = "Chandrakant";
//	
	
	int id;
	
	String name;
	
	
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.id = 101;
		System.out.println(student.id);
		
		student.name = "Vijay";
		System.out.println(student.name);
		
		System.out.println(student.id+ " , "+student.name);
		
		
//		System.out.println(student.id);
//		
//		System.out.println(student.name);
//		
	}
}
