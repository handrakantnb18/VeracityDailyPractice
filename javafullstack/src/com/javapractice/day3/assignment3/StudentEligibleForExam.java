package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class StudentEligibleForExam {

	public static void main(String[] args) {
		
		// 28. Write a program to check if a student is eligible for exam and has passed.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks : ");
		
		int marks = sc.nextInt();
		
		if(marks >= 75)
		{
			System.out.println("Your marks are good You are eligible and pass");
		}
		else if (marks >= 45)
		{
			System.out.println("You are eligible and passed");
		}
		else if (marks >= 35)
		{
			System.out.println("Your are eligible and passed");
		}
		else
		{
			System.out.println("You are fail and not eligible for exam");
		}
	}
}
