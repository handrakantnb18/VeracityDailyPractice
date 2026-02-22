package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class FindGreaterNumber {

	public static void main(String[] args) {

		// 15. Write a program to find the greater number between two numbers.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();

		if (num1 > num2) 
		{
			System.out.println(num1 + " is greater than " + num2);
		} 
		else if (num2 > num1)
		{
			System.out.println(num2 + " is greater than " + num1);
		}
		else 
		{
			System.out.println("Both numbers are equals : ");
		}
	}
}
