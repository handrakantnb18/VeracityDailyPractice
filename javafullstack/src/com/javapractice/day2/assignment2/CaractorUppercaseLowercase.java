package com.javapractice.day2.assignment2;

import java.util.Scanner;

public class CaractorUppercaseLowercase {

	public static void main(String[] args) {
		
		// 19. Write a program to check if a character is uppercase or lowercase.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charactor : ");
		
		char abc = sc.next().charAt(0);
		
		if(abc >= 'A' && abc <= 'Z')
		{
			System.out.println("Uppercase char.");
		}
		else if (abc >= 'a' && abc <= 'z')
		{
			System.out.println("Lower case char.");
		}
		else
		{
			System.out.println("Ti is not charactor.");
		}
	}
}
