package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class CheckWeekdaysWeekend {

	public static void main(String[] args) {
		
		// 40. Write a program to check whether the day is weekend or weekday.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day :");
		String day = sc.nextLine().toLowerCase();
		
		if(day.equals("saturday") || day.equals("saturday"))
		{
			System.out.println("Weekend.");
		}
		else if (day.equals("monday") || day.equals("Tuesday") ||
				day.equals("Wensday") || day.equals("thrusday") ||
				day.equals("friday"))
		{
			System.out.println("Weekdays");
		}
		else
		{
			System.out.println("Invalid days");
		}
	}
}
