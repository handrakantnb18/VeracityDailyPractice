package com.Day1.practice;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		// Print table of a number

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		int i = 1;

		do {
			System.out.println(num + " X " + i + " = " + (num * i));
			i++;
		} while (i <= 10);

		sc.close();
	}
}
