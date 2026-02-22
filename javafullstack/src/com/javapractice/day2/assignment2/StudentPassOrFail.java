package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class StudentPassOrFail {

	public static void main(String[] args) {
		// 17. Write a program to check if a student has passed or failed.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		if(num >= 45)
		{
			System.out.println("Student is Pass.");
		}
		else
		{
			System.out.println("Student is Fail.");
		}
	}
}
