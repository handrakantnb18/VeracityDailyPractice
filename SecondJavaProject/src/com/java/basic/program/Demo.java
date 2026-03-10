package com.java.basic.program;

import java.util.Scanner;

public class Demo {

	// Create a Scanner object to read input.

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer : ");
		
		int number = sc.nextInt();
		
		System.out.println("You entered : "+number);
	}
}
