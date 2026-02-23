package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class CheckStudentPass {

	public static void main(String[] args) {
		
		// 32. Write a program to check if a student passed both theory and practical exams.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student theroy marks : ");
		int theroy = sc.nextInt();
		
		System.out.println("Enter Student Practicla marks : ");
		int practical = sc.nextInt();
		
		if(theroy >= 35)
		{
			if(practical >= 35)
			{
				System.out.println("Student passed in both theory and practical.");
			}
			else
			{
				System.out.println("Student failed in practical");
			}
		}
		else
		{
			if(practical >= 35)
			{
				System.out.println("Student Failed in theory.");
			}
			else
			{
				System.out.println("Student failed both theory and practical");
			}
		}
	}
}
