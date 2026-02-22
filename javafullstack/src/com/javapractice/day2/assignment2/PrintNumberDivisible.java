package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class PrintNumberDivisible {

	public static void main(String[] args) {
		
		// 20. Write a program to check if a number is divisible by both 2 and 5.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0 && num % 5 == 0)
		{
			System.out.println(num+ " - is number divisible by 2 and 5.");
		}
		else
		{
			System.out.println(num+ " - is not divisible by both 2 and 5.");
		}
	}
}
