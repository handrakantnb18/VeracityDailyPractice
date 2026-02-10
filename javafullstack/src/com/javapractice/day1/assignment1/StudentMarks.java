package com.javapractice.day1.assignment1;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// Write a program to check if marks are pass or fail.

		// 1. check pass or fail marks

		int smarks = 50;

		if (smarks >= 35) {
			System.out.println("Pass.");
		} else {
			System.out.println("Fail.");
		}

		// 2. check pass or fail using scanner class

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");

		int marks = sc.nextInt();

		if (marks >= 35) {
			System.out.println("Pass.");
		} else {
			System.out.println("Fail");
		}

	}

}
