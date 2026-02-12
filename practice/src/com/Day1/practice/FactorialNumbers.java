package com.Day1.practice;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		
		// Factorial of numbers
		
		Scanner sc = new Scanner(System.in);
		int num, fact = 1;
		
		System.out.println("Enter number : ");
		num = sc.nextInt();
		
		do {
			fact *= num;
			num--;
		}while(num > 0);
		
		System.out.println("Factorial = "+fact);
		
		sc.close();
	}
}
