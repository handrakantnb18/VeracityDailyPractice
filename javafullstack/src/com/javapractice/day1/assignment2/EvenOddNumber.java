package com.javapractice.day1.assignment2;

import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		
		// 11. Write a program to check if a number is even or odd.
		
		// print scanner class and check Even or Odd
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd.");
		}
	}

}
