package com.collection;

import java.util.ArrayList;

public class StudentDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1, "Ram", "Pune"));
		
//		Student s1 = new Student();
//		s1.getId();
//		s1.getName();
//		
		
		
		
		System.out.println(al);
	}
}
