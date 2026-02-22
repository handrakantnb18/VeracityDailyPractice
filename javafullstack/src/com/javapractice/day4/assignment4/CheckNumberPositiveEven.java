package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class CheckNumberPositiveEven {

	public static void main(String[] args) {
		
		// 31. Write a program to check if a number is positive and even.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		if(num > 0)
		{
			if (num % 2 == 0)
			{
				System.out.println("Number is positive and Even.");
			}
			else
			{
				System.out.println("Number is positive and Odd.");
			}
		}
		else
		{
			System.out.println("Number is not positive.");
		}
	}
}
