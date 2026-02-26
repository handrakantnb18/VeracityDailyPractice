package com.Day2.practice;

import java.util.Scanner;

public class SwapTwoNumbers {

	// swap two numbers without using third variables
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		
		int a = 5;
		System.out.println("Enter Second number : ");
		
		int b = 10;
		System.out.println("Before swapping a :"+ a + ", "+ b + " ");
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping a = :"+ a + ", "+b +" ");
	}
}
