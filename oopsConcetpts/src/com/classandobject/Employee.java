package com.classandobject;

public class Employee {

//	int a= 10;
//	int b = 20;
//	int c = a + b;
	
	// variable
	int emp_id = 101;
	String name = "Chandrakant";
	int age = 28;
	
	static String company_Name = "Abc"; // static variable
	
	String fName = "Chandrakant"; // instance variable 
	
	void add()  // method
	{
		
	}
	
	
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		System.out.println(company_Name);
		//String s = fName("Chandrakant");
		
		System.out.println(employee.fName);
		
	}
}
