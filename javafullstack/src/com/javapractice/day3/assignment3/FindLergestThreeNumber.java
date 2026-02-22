package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class FindLergestThreeNumber {

	public static void main(String[] args) {
		
		// 26. Write a program to find the largest of three numbers using nested if.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter thirt number : ");
		int num3 = sc.nextInt();
		
		if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.println(num1+ " is the largest number.");
			}
			else
			{
				System.out.println(num3+ " is the largest number.");
			}
		}
		
		else
		{
			if(num2 > num3)
			{
				System.out.println(num2+ " is the largest number");
			}else
			{
				System.out.println(num3+ " is the largest number");
			}
		}
		
	}
}
