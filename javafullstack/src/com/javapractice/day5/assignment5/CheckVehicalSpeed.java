package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckVehicalSpeed {

	public static void main(String[] args) {
		
		// 41. Write a program to check if vehicle speed is overspeeding.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Speed : ");
		int speed = sc.nextInt();
		
		if (speed >= 60)
		{
			System.out.println("Vehical speed is limited.");
		}
		else
		{
			System.out.println("Vehical speed id overlimited.");
		}
	}
}
