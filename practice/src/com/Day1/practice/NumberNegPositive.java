package com.Day1.practice;

import java.util.Scanner;

public class NumberNegPositive {

	
	public static void main(String[] args) {
		
		// Check number is negative or positive
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Enter Number : ");
			num = sc.nextInt();
			
			if(num > 0)
				System.out.println("Positive");
			else if (num < 0)
				System.out.println("Negative");
			else
				System.out.println("Zero");
			
		}while (num != 0);
		
		sc.close();
	}
}
