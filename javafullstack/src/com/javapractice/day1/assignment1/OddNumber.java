package com.javapractice.day1.assignment1;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// Write a program to check if a number is odd.

		// 1. print odd number
		int num1 = 25;

		if (num1 % 2 == 0) {
			System.out.println("Number is Odd. " + num1);
		} else {
			System.out.println("Number is Even " + num1);
		}

		// 2. print odd number using Scanner class

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num2 = sc.nextInt();

		if (num2 % 2 == 0) {
			System.out.println("Even Number.");
		} else {
			System.out.println("Odd Number.");
		}
	}
}
