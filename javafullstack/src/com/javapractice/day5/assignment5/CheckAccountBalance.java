package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckAccountBalance {

	public static void main(String[] args) {
		
		// 48. Write a program to check if account balance is low.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check account balance : ");
		int balance = sc.nextInt();
		
		if(balance < 100)
		{
			System.out.println("Account balance is low");
		}
		else
		{
			System.out.println("Account balance is high.");
		}
	}
}
