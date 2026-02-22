package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class CheckNumberPositiveNegative {

	public static void main(String[] args) {
		
		// 12. Write a program to check if a number is positive or negative.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		// int num = 10;
		
		if (num >= 0)
		{
			System.out.println("Number is positive.");
		}
		else
		{
			System.out.println("Number is negative.");
		}
	}
}
