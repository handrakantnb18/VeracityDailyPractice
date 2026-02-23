package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class CheckNumberGreater {

	public static void main(String[] args) {
		
		// 36. Write a program to check if a number is greater than 10.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		if(num >= 10)
		{
			System.out.println("Number is greater than 10");
		}
		else
		{
			System.out.println("Number is not greater than 10");
		}
	}
}
