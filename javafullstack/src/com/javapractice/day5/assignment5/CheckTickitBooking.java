package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckTickitBooking {

	public static void main(String[] args) {
		
		// 47. Write a program to check if a ticket is available.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check tickit availabe : ");
		int isTickit = sc.nextInt();
		
		if(isTickit > 0)
		{
			System.out.println("Tickit is availabe.");
		}
		else
		{
			System.out.println("Tickit is not availabe.");
		}
				
	}
}
