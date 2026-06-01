package com.day3.zzjava8Examples;

import java.util.ArrayList;

public class StudentCollectionDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(101, "Vijay", 55.55, "pune"));
		list.add(new Student(102, "Chandrakant", 77.77, "pune"));
		list.add(new Student(103, "Priyanka", 44.44, "Mumbai"));
		list.add(new Student(104, "Shivraj", 88.88, "pune"));
		
		System.out.println("Students : "+list);
		
		System.out.println("========================");
		
		System.out.println("Students : ");
		
		for(Student student : list)
		{
			System.out.println(student);
		}
		
		System.out.println("=========================");
		
		list.forEach(System.out::println);
		
		
	}
}
