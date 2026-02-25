package com.methods;

public class Employee {

	double salary;
	
	// static method // non-instance method
	
	static void get()
	{
		 
		System.out.println("Get employee details");
	}
	
	// instance method  // non-static method
	
	void display()
	{
		System.out.println("Display employee details");
		
		System.out.println("Salary "+salary);
	}
	
	
	void changeSalary(double newSalary)
	{
		salary = newSalary;
	}
	
	public static void main(String[] args) {
		
		Employee.get();
		
		
		Employee emp1 = new Employee();
		emp1.salary = 10000;
		emp1.display();
		emp1.changeSalary(150000);
		emp1.display();
		
		Employee.get();
		Employee emp2 = new Employee();
		emp2.salary = 20000;
		emp2.display();
		emp2.changeSalary(250000);
		emp2.display();
		
	}
}
