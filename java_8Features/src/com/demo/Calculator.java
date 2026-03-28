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
		
		Substraction substraction = new Substraction();
		
		Calculator.calculator(substraction);
		
		Division division = new Division();
		
		Calculator.calculator(division);
		
		
		// Test x = new Addition();
		
		
		
	}
}
