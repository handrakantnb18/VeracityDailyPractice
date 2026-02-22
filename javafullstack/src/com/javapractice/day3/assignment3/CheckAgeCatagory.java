package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class CheckAgeCatagory {

	public static void main(String[] args) {
		
		// 25. Write a program to check age category (child, adult, senior citizen).

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age Catagory : ");
		
		int categ = sc.nextInt();
		
		if(categ >= 65)
		{
			System.out.println("You are Senior Citizen.");
		}
		else if (categ >= 18)
		{
			System.out.println("You are Adult.");
		}
		else if(categ <= 18 )
		{
			System.out.println("You are Child.");
		}
		else
		{
			System.out.println("You are entered wrong.");
		}
	}
}
