package com.java.functionalInterface;

public class FunctionalInterface {

	// Using a Functional Interface with a Lambda Expression
	
	public static void main(String[] args) {
		
		// Using lambda expression to implement Runnable
        new Thread(() -> System.out.println("New thread created")).start();
    
        new Thread(() -> System.out.println("One thread created")).start();

        new Thread(() -> System.out.println("One thread created")).start();

	}
}
