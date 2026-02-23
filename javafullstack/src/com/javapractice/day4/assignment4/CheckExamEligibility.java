package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class CheckExamEligibility {

	public static void main(String[] args) {
		
		// 35. Write a program to check exam eligibility based on attendance and marks.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Attendance Percentage : ");
		double attendance = sc.nextDouble();
		
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		if (attendance >= 75 && marks >= 40)
		{
			System.out.println("Student is eligible for the exam.");
		}
		else if (attendance < 75 && marks >= 40)
		{
			System.out.println("Student not eligible due to low attendance");
		}
		else if (attendance >= 75 && marks < 40)
		{
			System.out.println("Student not eligible for due to low marks.");
		}
		else
		{
			System.out.println("Student not eligible for the both low attendance and marks.");
		}
	}
}
