package com.j8features.java8coding;

public class FactorialNumber {

	public static void main(String[] args) {
		
		// Factorial Program
		
		int num = 5;
		int fact = 1;
		
		for(int i=1; i<= num; i++)
		{
			fact *= i;
		}
		
		System.out.println(fact);
		
	}
}
