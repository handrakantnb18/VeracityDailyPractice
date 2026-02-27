package com.inheritance;

public class JavaDeveloper extends Employee {
	
	void developJavaProgram()
	{
		System.out.println("Java Developer is programmer.");
	}
	public static void main(String[] args) {
		
		JavaDeveloper j = new JavaDeveloper();
		j.employeeId = 101;
		j.employeeName = "Chandrakant";
		j.work();
		j.eat();
		j.developJavaProgram();
		
		System.out.println(j.employeeId);
		System.out.println(j.employeeName);
		
	}

}
