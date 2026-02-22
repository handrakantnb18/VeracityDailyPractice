package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class MarksGreads {

	public static void main(String[] args) {
		
		// 21. Write a program to display grade based on marks using else-if.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		
		int marks = sc.nextInt();
		
		if(marks >= 90)
		{
			System.out.println("Gread id A");
		}
		else if (marks >= 70)
		{
			System.out.println("Gread is B");
		}
		else if(marks >= 50)
		{
			System.out.println("Gread is C");
		}
		else if(marks >= 35)
		{
			System.out.println("Gread is D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
