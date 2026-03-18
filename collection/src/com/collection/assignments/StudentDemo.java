package com.collection.assignments;

import java.util.ArrayList;

public class StudentDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> stud1 = new ArrayList<Student>();
		stud1.add(new Student(1, "Chandrakant", 25, "Master", 65, "Pune"));
		stud1.add(new Student(2, "priyanka", 23, "Java", 70, "Mumbai"));
		stud1.add(new Student(3, "Smith", 35, "html", 67, "sangli"));
		stud1.add(new Student(4, "vijay", 30, "Maths", 75, "banglore"));
		stud1.add(new Student(5, "sam", 27, "Master", 80, "delhi"));
		stud1.add(new Student(6, "Ram", 33, "CSS", 55, "Pune"));
		stud1.add(new Student(7, "prakash", 45, "mysql", 45, "delhi"));
		stud1.add(new Student(8, "peterson", 44, "Node", 59, "chennai"));
		stud1.add(new Student(9, "micel", 25, "Master", 49, "Pune"));
		stud1.add(new Student(10, "michelle", 28, "React", 35, "chennai"));
		
		System.out.println(stud1);
		
	}
}
