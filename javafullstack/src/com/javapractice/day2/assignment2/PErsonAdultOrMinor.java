package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class PErsonAdultOrMinor {

	public static void main(String[] args) {
		// 13. Write a program to check if a person is adult or minor.

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int age = sc.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Person is a Adult.");
		}
		else
		{
			System.out.println("Person is Minor");
		}
		
//		int age = 18;
//		
//		if(age >= 18)
//		{
//			System.out.println("Person is Adult.");
//		}else
//		{
//			System.out.println("Person is Minor.");
//		}
	}
}
