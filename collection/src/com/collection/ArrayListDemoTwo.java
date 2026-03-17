package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemoTwo {

	public static void main(String[] args) {
		
		ArrayList<Employee> employee= new ArrayList<Employee>();
		
		employee.add(new Employee(1, "Chandraaknt", "Pune", "540000", "IT", "Male"));
		employee.add(new Employee(2, "priyanka", "Pune", "550000", "IT", "Female"));
		employee.add(new Employee(3, "ram", "Pune", "450000", "HR", "Male"));
		employee.add(new Employee(4, "prakash", "Pune", "350000", "Account", "Male"));
		employee.add(new Employee(5, "viajay", "mumbai", "250000", "IT", "Male"));
		employee.add(new Employee(6, "amiee smith", "Pune", "500000", "Software", "Female"));
		
		for(Employee emp1 :employee)
		{
			System.out.println("\n==============================");
			
			System.out.println("Id      : "+emp1.getId());
			System.out.println("Name    : "+emp1.getName());
			System.out.println("Address : "+emp1.getAddress());
			System.out.println("Salary  : "+emp1.getSalary());
			System.out.println("Dept    : "+emp1.getDep());
			System.out.println("Gender  : "+emp1.getGender());
		}
		
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(100);
//		al.add(200);
//		al.add(300);
//		
//		System.out.println(al);
		
//		Student s1 = new Student(1, "Chandraaknt","Pune");
//		s1.setId(1);
//		s1.setName("chandrakant");
//		s1.setAddress("pune");
		
		
//		Student s2 = new Student(2, "Priyanka", "Sangli");
//		s2.setId(2);
//		s2.setName("priyanka");
//		s2.setAddress("sangli");
		
//		Student s3 = new Student(3, "Ravi", "Pune");
//		s3.setId(3);
//		s3.setName("ravi");
//		s3.setAddress("pune");
//		
//		Student s4 = new Student(4, "Vijay", "Mumbai");
//		s4.setId(4);
//		s4.setName("vijay");
//		s4.setAddress("mumbai");
		
		
//		ArrayList<Student> al = new ArrayList<Student>();
//		al.add(new Student(1, "Chandraaknt","Pune"));
//		al.add(new Student(2, "Priyanka", "Sangli"));
//		al.add(new Student(3, "Ravi", "Pune"));
//		al.add(new Student(4, "Vijay", "Mumbai"));
		
		
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		al.add(s4);
//		
//		for(int i= 0; i <al.size(); i++)
//		{
//			System.out.println(al.get(i));
//		}
		
//		for(Student s : al)
//		{
//			System.out.println("Id	: "+s.getId());
//			System.out.println("Name 	: "+s.getName());
//			System.out.println("Address : "+s.getAddress());
//			System.out.println("==================");
//		}
		
//		Iterator<Student> itr = al.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
	}
}
