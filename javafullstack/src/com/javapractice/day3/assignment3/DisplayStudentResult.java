package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class DisplayStudentResult {

	public static void main(String[] args) {
		
		// 22. Write a program to display student result category using marks.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks :");
		
		int catag = sc.nextInt();
		
		if(catag >= 85)
		{
			System.out.println("A+ ");
		}
		else if( catag >= 65)
		{
			System.out.println("B+");
		}
		else if(catag >= 45)
		{
			System.out.println("C+");
		}
		else if(catag >= 35)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("You are Fail.");
		}
	}
}
