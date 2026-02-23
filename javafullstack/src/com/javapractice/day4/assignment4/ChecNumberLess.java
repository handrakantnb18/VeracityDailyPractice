package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class ChecNumberLess {

	public static void main(String[] args) {
		
		// 37. Write a program to check if a number is less than 5.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num = sc.nextInt();
		
		if (num <= 5)
		{
			System.out.println("Number is less than 5.");
		}
		else
		{
			System.out.println("Number is not less than 5.");
		}
	}
}
