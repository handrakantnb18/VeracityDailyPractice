package com.Day1.practice;

public class SumNumbers {

	public static void main(String[] args) {
		
		// Sum of numbers from 1 to 20
		
		int i = 1, sum = 0;
		
		do {
			sum += i;
			i++;
		}while(i <= 20);
		
		System.out.println("Sum of "+sum);
	}
}
