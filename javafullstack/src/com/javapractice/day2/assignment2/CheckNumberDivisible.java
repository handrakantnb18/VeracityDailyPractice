package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class CheckNumberDivisible {

	public static void main(String[] args) {
		
		// 16. Write a program to check if a number is divisible by 3.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0)
		{
			System.out.println(num+" Number is divisible by 3.");
		}
		else
		{
			System.out.println(num+ " is not divisible by 3. ");
		}
	}
}
