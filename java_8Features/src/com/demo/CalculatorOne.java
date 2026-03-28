package com.demo;

public class CalculatorOne {

	static void calculate(Demo x)
	{
		x.calculate(400, 50);
	}
	
	// lambda expression in simple way function inside the function in java
	
	public static void main(String[] args) {
		
		CalculatorOne.calculate((int a, int b) -> System.out.println("Addition : "+(a+b)));
		
		CalculatorOne.calculate((int a, int b)-> System.out.println("Substraction : "+(a-b)));
		
		CalculatorOne.calculate((int a, int b)-> System.out.println("Division : "+(a/b)));
		
		CalculatorOne.calculate((int a, int b)-> System.out.println("Multiplication : "+(a*b)));
		
		
	}
}
