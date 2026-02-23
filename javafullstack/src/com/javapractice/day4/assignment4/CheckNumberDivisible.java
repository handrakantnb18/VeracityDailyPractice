package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class CheckNumberDivisible {

	public static void main(String[] args) {
		// 38. Write a program to check if a number is divisible by 3.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		if (num % 3 == 0)
		{
			System.out.println("Number is Divisible by 3");
		}
		else
		{
			System.out.println("Number is not divisible by 3");
		}
	}
}
