package com.Day1.practice;

import java.util.Scanner;

public class CountDigitNumber {

	public static void main(String[] args) {
		
		// Count digits in a number
		
		Scanner sc = new Scanner(System.in);
		
		int num, count= 0;
		
		System.out.println("Enter number : ");
		num = sc.nextInt();
		
		do {
			count++;
			num /= 10;
		}while(num != 0);
		
		System.out.println("Digits of "+count);
		
		sc.close();
	}
}
