package com.javapractice.day1.assignment1;

import java.util.Scanner;

public class CheckTemperature {

	public static void main(String[] args) {

		// 10. Write a program to check if temperature is high.

		// check Temperature for using scanner class

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Temperature");
		int temprature = sc.nextInt();

		
		if (temprature > 50) {
			System.out.println("High Temperature...");
		} else {
			System.out.println("Low Temperature..");
		}

		// check Temperature for simple way

		int Temperature1 = 30;
		
		if (Temperature1 > 35)
		{
			System.out.println("High Temperature");
		}
		else
		{
			System.out.println("Low Temperature");
		}

	}

}
