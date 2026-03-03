package com.B;

import com.A.Student;

public class User {
	
	// object access by using import package
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		// accessed different class and package variables
		
		System.out.println(s1.id);
	}

}
