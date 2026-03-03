package com.B;

import com.A.Student;

public class User extends Student {
	
	// object access by using import package
	
	public static void main(String[] args) {
		
		// Student s1 = new Student();
		
		// accessed different class and package variables
		
		// System.out.println(s1.id);
		
		// access different package public keyword
		
		// s1.m1();
		
		
		 // access by  using the child class object
		
		User u = new User();
		System.out.println(u.id);
	}

}
