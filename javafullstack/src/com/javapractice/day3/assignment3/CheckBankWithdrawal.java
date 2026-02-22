package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class CheckBankWithdrawal {

	public static void main(String[] args) {
		
		// 29. Write a program to check bank withdrawal conditions using nested if.

		Scanner sc = new Scanner(System.in);
		
		double balance = 2000;
		int pin = 1818;
		boolean accActive = true;
		
		System.out.println("Enter PIN : ");
		int pin1 = sc.nextInt();
		
		if (accActive)
		{
			if (pin1 == pin)
			{
				
				System.out.println("Enter withdrawal amount : ");
				double amount = sc.nextDouble();
				
				if(amount <= balance)
				{
					balance = balance - amount;
					System.out.println("Withdrwa Success");
					System.out.println("Remainning Balance : "+balance);
				}
				else
				{
					System.out.println("Insufficient Balance.");
				}
			}
			else
			{
				System.out.println("Incorrect PIN.");
			}
		}
		else
		{
			System.out.println("Account is not active.");
		}
	}
}
