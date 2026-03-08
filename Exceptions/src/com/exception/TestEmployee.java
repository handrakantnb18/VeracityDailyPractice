package com.exception;

public class TestEmployee {

	void employee(int empid) throws EmployeeNotFountException
	{
		
		if(empid != 1)
		{
			throw new EmployeeNotFountException("Employee not found with id : "+empid);
		}
		System.out.println("Employee found successfully.");
	}
	
	public static void main(String[] args) {
		TestEmployee te = new TestEmployee();
		
		try
		{
			te.employee(10);
		}
		catch(EmployeeNotFountException em)
		{
			System.out.println(em.getMessage());
		}
	}
}
