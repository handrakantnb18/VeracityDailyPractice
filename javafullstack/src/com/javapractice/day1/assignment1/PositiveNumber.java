package com.javapractice.day1.assignment1;

public class PositiveNumber {

	// Write a program to check if a number is positive
	
	public static void main(String[] args) {
		
		// 1) simple Number is positive
		
		int number = 10;
		
		
		
		if (number > 0) {
			System.out.println("Number is Positive...");
			
		} 	
		
		if (number > 0) {
			System.out.println("\nNumber is Negative.");
		}	
		
		// 2) simple Number is positive
		
		int number1 = -10;
		
		if ( number1 < 0) {
			System.out.println("\nNumber is Negative.");
		}	
		
		
		// 3) Number is positive or nigetive
		
		// 1
		int num1 = 10;
		int num2 = -10;
		
		if (num1 < 0 && num2 > 0) {
			System.out.println("\nNumber is positive.");
			
		}else {
			System.out.println("\nNumber is negative");
		}
		
		// 2
		if (num1 > 0 && num2 < 0) {
			System.out.println("\nNumber is positive");
		}
		else {
			System.out.println("\nNumber is nagetive.");
		}
		
		// 4) Number is po
		
		int a = 50;
		
		if (a < 18 && a > 18) {
			System.out.println("\nEllagible for the voting");
		}
		else {
			System.out.println("\nNot Eligible.");
		}
		
		//
		
	}
	
	
}
