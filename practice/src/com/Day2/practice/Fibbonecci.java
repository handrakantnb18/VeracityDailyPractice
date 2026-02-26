package com.Day2.practice;

import java.util.Scanner;

public class Fibbonecci {

	// Fibonacci series
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number  = 6;
		int first = 0, second = 1, next;
		
		
		System.out.println("Enter Number : ");
		
		for(int i = 0; i <= number; i++)
		{
			System.out.println(first+ " ");
			next = second + first;
			first = second;
			second = next;
		}
	}
}
