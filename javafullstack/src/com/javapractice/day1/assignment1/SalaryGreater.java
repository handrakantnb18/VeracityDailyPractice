package com.javapractice.day1.assignment1;

import java.util.Scanner;

public class SalaryGreater {

	public static void main(String[] args) {
		
		// 9. Write a program to check if salary is greater than 25,000
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Check Salary ");
		
		double salaryCheck = sc.nextDouble();
		
		double salary = 25000;
		
		if (salaryCheck >= 25000) {
			System.out.println("Salary is greater than. "+salary);
		}
		
		else {
			System.out.println("Salary is smaller than. "+salary);
		}
	}
}
