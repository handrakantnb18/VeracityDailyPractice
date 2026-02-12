package com.Day1.practice;

public class SumOfFirst5 {

	public static void main(String[] args) {
		
		// Sum of first 5 numbers
		
		int i = 1, sum = 0;
		
		do {
			//System.out.println("Sum of numbers.");
			sum = sum + i;
			i++;
		}while(i <= 5);
		
		System.out.println("Sum = "+sum);
	}
}
