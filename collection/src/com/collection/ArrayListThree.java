package com.collection;

import java.util.ArrayList;

public class ArrayListThree {

	public static void main(String[] args) {
		
		ArrayList<Employees> employees = new ArrayList<Employees>();
		
		employees.add(new Employees(1, "Chandrakant", "india", "45000", "IT", "Male"));
		employees.add(new Employees(2, "priyanka", "Pune", "550000", "IT", "Female"));
		employees.add(new Employees(3, "Ram", "Mumbai", "250000", "HR", "Male"));
		employees.add(new Employees(4, "vijay", "Mumbai", "270000", "HR", "Male"));
		
//		for(Employees emp:employees)
//		{
//			System.out.println("=====================");
//			
//			System.out.println("Id      : "+emp.getId());
//			System.out.println("Name    : "+emp.getName());
//			System.out.println("Address : "+emp.getAddress());
//			System.out.println("Salary  : "+emp.getSalary());
//			System.out.println("Dept    : "+emp.getDep());
//			System.out.println("Gender  : "+emp.getGender());
//			
//			
//		}
		
//		for (Employees emp3 :employees)
//		{
//			if (emp3.getAddress().equals("Pune"))
//				
//			System.out.println(emp3);
//		}
		
		for (Employees emp3 :employees)
		{
			if (emp3.getDep().equals("IT"))
				
			System.out.println(emp3);
		}
	}
}
