package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class CheckEmployeeBonus {

	public static void main(String[] args) {

		// 30. Write a program to check employee bonus eligibility using nested if.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter years of services : ");
		int years = sc.nextInt();

		System.out.println("Enter Performance : ");
		int rating = sc.nextInt();
		
		if (years >= 2) {

			if (rating >= 4)
			{
				System.out.println("Employee is eligible for the bonus.");
			}
			else
			{
				System.out.println("Employee is not eligible for the bonus");
			}
		}
		else
		{
			System.out.println("Not eligible due to less years of services");
		}
	}
}
