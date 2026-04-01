package com.predefinedjavagenerics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeList {

	// 34 predifined generics
	
	public static void main(String[] args) {
		
		// Single employee
		
//		Consumer<Employee> c1 = (x)->
//		{
//			for(Employee e: x)
//			{
//				System.out.println(e);
//			}
//		};
//		
//		c1.accept(new Employee(1, "Priyanka", "Transport", "SP Pune"));
//		
		
		// List of employees
		
		Consumer<List<Employee>> c1 = (x)->
		{
			for(Employee e: x)
			{
				System.out.println(e);
			}
		};
		
		c1.accept(Arrays.asList(new Employee(1, "Priyanka", "Transport", "SP Pune"),
				new Employee(2, "Chandrakant", "IT", "Pune"),
				new Employee(3, "Ram", "Sales", "Mumbai")));
				
		
	}
}
