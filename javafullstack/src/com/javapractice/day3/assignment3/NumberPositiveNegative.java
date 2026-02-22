package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class NumberPositiveNegative {

	public static void main(String[] args) {
		
		// 24. Write a program to check whether a number is positive, negative, or zero.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		if(num >= 0)
		{
			System.out.println("Number is positive.");
		}
		else
		{
			System.out.println("Number is Negative.");
		}
	}
}
