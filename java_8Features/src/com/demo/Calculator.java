package com.demo;

public class Calculator {

	static void calculator(Test x)
	{
		
		// addition calculate
		
		x.calculator(100, 20);
		
		// i want to call calculate method into Test
		
	}
	
	public static void main(String[] args) {
		
		Addition addition = new Addition();
		
		Calculator.calculator(addition);
		
		// Test x = new Addition();
		
		
		
	}
}
