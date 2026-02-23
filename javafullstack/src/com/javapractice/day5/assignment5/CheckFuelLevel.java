package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckFuelLevel {

	public static void main(String[] args) {
		
		// 45. Write a program to check if fuel level is low.

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Fuel level in liter : ");
		int feul = sc.nextInt();
		
		if (feul <= 50)
		{
			System.out.println("Fuel is Low.");
		}
		else
		{
			System.out.println("Fuel is Sufficient.");
		}
	}
}
