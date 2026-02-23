package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class CheckTemprature {

	public static void main(String[] args) {
		
		// 39. Write a program to check if temperature is within normal range.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check Temparature : ");
		double temp = sc.nextDouble();
		
		if (temp >= 36 && temp <= 37.50)
		{
			System.out.println("Temparature is within normal range.");
		}
		else 
		{
			System.out.println("Temparature is not within normal.");
		}
	}
}
