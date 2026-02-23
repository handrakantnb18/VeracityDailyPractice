package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckStudentMarks {

	public static void main(String[] args) {
		
		// 44. Write a program to check if a student scored perfect marks.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		if (marks == 100)
		{
			System.out.println("Student scored perfect marks");
		}
		else
		{
			System.out.println("Student did not score perfect marks.");
		}
	}
}
