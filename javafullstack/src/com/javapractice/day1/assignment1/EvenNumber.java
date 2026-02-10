package com.javapractice.day1.assignment1;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// Write a program to check if a number is even.

		// 1. simple program Even number
		int num2 = 24;

		if (num2 % 2 == 0) {
			System.out.println("Number is even");
		}
		// System.out.println("Number not found");

		// using scanner class for the even number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num1 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("Even Number.");
		} else {
			System.out.println("Odd number.");
		}

	}
}
