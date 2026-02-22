package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class CheckZeroOrNonZero {

	public static void main(String[] args) {
		
		// 14. Write a program to check if a number is zero or non-zero.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		if(num <= 0)
		{
			System.out.println("Number is zero");
		}
		else
		{
			System.out.println("Number is non-zero");
		}
//		int num = 10;
//		
//		if(num <= 0)
//		{
//			System.out.println("Number is Zero.");
//		}
//		else
//		{
//			System.out.println("Number is non-zero.");
//		}
	}
}
