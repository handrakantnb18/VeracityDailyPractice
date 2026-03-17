package com.collection;

import java.util.ArrayList;

public class ArrayListDemoTwo {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(100);
//		al.add(200);
//		al.add(300);
//		
//		System.out.println(al);
		
		Student s1 = new Student();
		s1.id = 1;
		s1.name= "chandrakant";
		s1.address = "pune";
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
	}
}
