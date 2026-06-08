package com.java8featuresAll.features;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class LambdaFunctionalExample {

	 public static void main(String[] args) {
	        Calculator add = (a, b) -> a + b;
	        Calculator multiply = (a, b) -> a * b;

	        System.out.println("Addition: " + add.operate(5, 3)); // Outputs 8
	        System.out.println("Multiplication: " + multiply.operate(5, 3)); // Outputs 15
	    }
}
