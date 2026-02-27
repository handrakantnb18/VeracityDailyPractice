package com.inheritance;

public class PhythonDeveloper extends Employee {

	void work()
	{
		super.work();
		super.eat();
		System.out.println("Phython developer.");
		super.work(); // acces parent class property
	}
	public static void main(String[] args) {

		PhythonDeveloper p = new PhythonDeveloper();
		p.employeeId = 102;
		p.employeeName = "Bhosale";
		p.work();
		p.eat();
	}
}
