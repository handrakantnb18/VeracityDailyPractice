package com.main;

import com.controller.EmployeeController;
import com.entity.Employee;
import com.exception.SomethingWentWrongException;

public class EmployeeMain {

	
	// 1. User -- username, password, email, gender, dob, mobileNo, address, age
	// insert, update, delete, get, getall
	
	// 2. Book -- id, name, price, auther, qty, mfgdate, expand
	// insert, updated, delete, get. getAll
	
	// 3. Product -- id, name, price, catagory, qty
	// insert, update, delete, get, getAll
	
	public static void main(String[] args) {
		
		
		EmployeeController controller = new EmployeeController();
		
//		Employee e1 = new Employee(25, "Sachin", "Male", "Pune", 26000, "Sales");
//		Employee e2 = new Employee(26, "Pratik", "Male", "Mumbai", 45000, "IT");
//		Employee e3 = new Employee(27, "Shid", "Male", "Sangli", 880000, "HR");
//		Employee e4 = new Employee(28, "Pramod", "Male", "Pune", 5500000, "Account");
//		Employee e5 = new Employee(29, "Santosh", "Male", "Kashmir", 560000, "ED");
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
//		
//		try
//		{
//		Employee e6 = new Employee(28, "matt", "Female", "Pune", 25000, "IT");
//		
//		String msg = controller.update(e6);
//		
//		System.out.println(msg);
//		}
//		catch(SomethingWentWrongException e)
//		{
//			System.out.println(e.getMessage());
//		}
	
		
		try
		{
			System.out.println(controller.delete(22));
		}
		catch(SomethingWentWrongException e)
		{
			e.printStackTrace();
		}
		
	}
}
