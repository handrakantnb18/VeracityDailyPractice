package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class CheckYearLeapOrNot {

	public static void main(String[] args) {
		
		// 18. Write a program to check whether the given year is leap year or not.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int year = sc.nextInt();
		
		
		if((year %4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("is a leap year : "+year);
		}
		else {
			System.out.println("Not leap year : "+year);
		}
	}
}
