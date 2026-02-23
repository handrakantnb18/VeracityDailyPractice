package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckAccountLocked {

	public static void main(String[] args) {
		
		// 43. Write a program to check if an account should be locked after attempts.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of attempt to login : ");
		int login = sc.nextInt();
		
		if(login < 3)
		{
			System.out.println("Account Active");
		}
		else
		{
			System.out.println("Account locked.. due to multiple attempt.. please check again..");
		}
	}
}
