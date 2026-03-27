package com.main;

import com.controller.EmployeeController;
import com.entity.Employee;
import com.exception.SomethingWentWrongException;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		EmployeeController controller = new EmployeeController();
		
//		Employee e1 = new Employee(25, "Sachin", 25000, "Male", "Pune", "Sales");
//		Employee e2 = new Employee(26, "Pratik", 45000, "Male", "Mumbai", "IT");
//		Employee e3 = new Employee(27, "Shid", 89000, "Male", "Sangli", "HR");
//		Employee e4 = new Employee(28, "Pramod", 55000, "Male", "Pune", "Account");
//		Employee e5 = new Employee(29, "Santosh", 65000, "Male", "Kashmir", "ED");
//		
//		
//		String msg1 = controller.insertEmployee(e1);
//		String msg2 = controller.insertEmployee(e2);
//		String msg3 = controller.insertEmployee(e3);
//		String msg4 = controller.insertEmployee(e4);
//		String msg5 = controller.insertEmployee(e5);
//		
//		System.out.println(msg1);
//		System.out.println(msg2);
//		System.out.println(msg3);
//		System.out.println(msg4);
//		System.out.println(msg5);
		
		try
		{
		Employee e2 = new Employee(29, "Priyanka", "Female", "Pune", "IT");
		
		String msg = controller.update(e2);
		
		System.out.println(msg);
		}
		catch(SomethingWentWrongException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
