package com.Day1.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		// Reverse a number
		
		Scanner sc = new Scanner(System.in);
		int num, rev = 0;
		
		System.out.println("Enter number : ");
		num = sc.nextInt();
		
		do {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}while (num != 0);
		
		System.out.println("Reverse number = "+rev);
		sc.close();
	}
}
