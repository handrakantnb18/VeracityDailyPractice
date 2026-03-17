package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoTwo {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(100);
//		al.add(200);
//		al.add(300);
//		
//		System.out.println(al);
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("chandrakant");
		s1.setAddress("pune");
		
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("priyanka");
		s2.setAddress("sangli");
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("ravi");
		s3.setAddress("pune");
		
		Student s4 = new Student();
		s4.setId(4);
		s4.setName("vijay");
		s4.setAddress("mumbai");
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
//		for(int i= 0; i <al.size(); i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		for(Student s : al)
		{
			System.out.println("Id	: "+s.getId());
			System.out.println("Name 	: "+s.getName());
			System.out.println("Address : "+s.getAddress());
			System.out.println("==================");
		}
		
//		Iterator<Student> itr = al.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
	}
}
