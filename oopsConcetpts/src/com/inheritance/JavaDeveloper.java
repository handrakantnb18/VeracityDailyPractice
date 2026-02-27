package com.inheritance;

public class JavaDeveloper extends Employee {
	
	public static void main(String[] args) {
		
		JavaDeveloper j = new JavaDeveloper();
		j.employeeId = 101;
		j.employeeName = "Chandrakant";
		j.work();
		j.eat();
		
		System.out.println(j.employeeId);
		System.out.println(j.employeeName);
		
	}

}
