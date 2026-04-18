package com.aone;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num =5;
		int fact = 1;
		
		for(int i=1;i<=num;i++)
		{
			fact *= i;
		}
		System.out.println(fact);
		
		
		int num1 = 10;
		int fact1 =1;
		
		for(int i=1; i<=num1;i++)
		{
			fact1 *= i;
		}
		System.out.println(fact1);
	}
}
