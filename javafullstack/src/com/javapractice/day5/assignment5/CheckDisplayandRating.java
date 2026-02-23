package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckDisplayandRating {

	public static void main(String[] args) {
		
		// 50. Write a program to check rating and display feedback.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rating 1 - 5 :");
		int rating = sc.nextInt();
		
		if(rating == 5)
		{
			System.out.println("Excellent Services.");
		}
		else if (rating == 4)
		{
			System.out.println("Very good services.");
		}
		else if (rating == 3)
		{
			System.out.println("Good services.");
		}
		else if (rating == 2)
		{
			System.out.println("Avarage services.");
		}
		else if (rating == 1)
		{
			System.out.println("Poor services.");
		}
		else
		{
			System.out.println("Invalid rating.");
		}
	}
}
