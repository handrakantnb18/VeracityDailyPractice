package com.java.eightprogram;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		
		for(int i = 11; i <= num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial : "+fact);
	}
}
