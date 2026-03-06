package com.encapsulation;

public class Stud {

	// object created private variable class and access all properties
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setName("Priyanka");
		System.out.println(s1.getName());
		
		s1.setMobileno("8799857751");
		System.out.println(s1.getMobileno());
		
		s1.setAddress("Pune");
		System.out.println(s1.getAddress());
		
		s1.setMarks("75");
		System.out.println(s1.getMarks());
		
	}
}
