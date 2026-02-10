package com.javapractice.day1.assignment1;

import java.util.Scanner;

public class PersonVote {

	public static void main(String[] args) {

		// Write a program to check if a person is eligible to vote.
		
		int age = 25;
		
		if (age > 18) {
			System.out.println("Eligible for voting.");
		}
		
		// 2. Person is eligible for the vote
		
		if (age >= 18) {
			System.out.println("Eligible for the vote.");
		}
		else {
			System.out.println("Not eligible for the vote.");
		}
		
		// enter number and check the Eligible for vote or nor
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		
		int a = sc.nextInt();
		
		if (a >= 18) {
			System.out.println("Eligible for voting. "+a);
		}
		else {
			System.out.println("Not eligible for voting. "+a);
		}
		
	}

}
