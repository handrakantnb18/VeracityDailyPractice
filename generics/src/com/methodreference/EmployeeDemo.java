package com.methodreference;

import java.util.Arrays;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(new Employee(1, "Chandraaknt", "Male", 2500000.00, "Pune"));
		
		System.out.println(emp);
		
		//emp.forEach();
		
	}
}
