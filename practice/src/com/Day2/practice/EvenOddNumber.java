package com.Day2.practice;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		// check even or Odd number 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Even number.");
		}
		else
		{
			System.out.println("Odd number.");
		}
	}
}
