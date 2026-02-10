package com.javapractice.day1.assignment1;

import java.util.Iterator;
import java.util.Scanner;

public class DivisibleNumber {

	public static void main(String[] args) {

		// 8. Write a program to check if a number is divisible by 5.

		// 3. simple way

		int a = 20;
		int b = 5;

		int c = a / b;

		System.out.println("Number is = " + c);

		// check number divisible by 5 simple way

		int num = 50;

		if (true) {
			System.out.println("Divisible by - " + num / 5);
		}

		// 2. number is divisible by 5 using scanner class

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");

		int num1 = sc.nextInt();

		System.out.println("Number is = " + num1 / 5);
	}

}
