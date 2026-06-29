package com.java14featuresAll.features;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int fact = 1;
		
		for(int i=1;i<=5;i++)
		{
			fact *= i;
			
			System.out.println(fact);
		}
	}
}
