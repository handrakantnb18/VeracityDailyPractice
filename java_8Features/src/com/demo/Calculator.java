package com.demo;

public class Calculator {

	static void calculator(Test x)
	{
		
		// addition calculate
		
		x.calculator(100, 20);
		
		// i want to call calculate method into Test
		
	}
	
	public static void main(String[] args) {
		
//		Addition addition = new Addition();
		
//		Calculator.calculator(addition);
//		
//		Substraction substraction = new Substraction();
//		
//		Calculator.calculator(substraction);
//		
//		Division division = new Division();
//		
//		Calculator.calculator(division);
//		
//		Multiplication multiplication = new Multiplication();
//		
//		Calculator.calculator(multiplication);
	
		
		// we are passing object to the Method as an arguments
		
//		Calculator.calculator(new Addition());
		
//		Calculator.calculator(new Substraction());
		
//		Calculator.calculator(new Division());
		
//		Calculator.calculator(new Multiplication());
		
		// Lambda expression with less code
		
//		Calculator.calculator((int a, int b)->
//		{
//			System.out.println("Addition : "+(a+b));
//		});
//		
//		
//		Calculator.calculator((int a, int b) ->
//		{
//			System.out.println("Substraction : "+(a-b));
//		});
//		
//		Calculator.calculator((int a, int b) ->
//		{
//			System.out.println("Division : "+(a/b));
//		});
//		
//		Calculator.calculator((int a, int b)->
//		{
//			System.out.println("Multiplication : "+(a*b));
//		});
//		
//		
		// lambda expression in one line to pro level
		
		Calculator.calculator((int a, int b)-> System.out.println("Addition : "+(a+b)));
		
		Calculator.calculator((int a, int b) -> System.out.println("Substraction : "+(a-b)));
		
		Calculator.calculator((int a, int b) -> System.out.println("Division : "+(a/b)));
		
		Calculator.calculator((int a, int b)-> System.out.println("Multiplication : "+(a*b)));
		
		
		// Test x = new Addition();
			
	}
}
