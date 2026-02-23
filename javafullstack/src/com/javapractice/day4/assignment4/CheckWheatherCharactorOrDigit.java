package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class CheckWheatherCharactorOrDigit {

	public static void main(String[] args) {

		// 34. Write a program to check whether a character is digit or alphabet.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Charactor : ");
		char ch = sc.next().charAt(0);

		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
		{
			System.out.println("it is a Alphabet. ");
		}
		else if (ch >= '0' && ch <= '9')
		{
			System.out.println("It is a Digit.");
		}
		else
		{
			System.out.println("It is a Special charactor.");
		}

	}
}
