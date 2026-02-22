package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class CheckLoginCreadintioals {

	public static void main(String[] args) {
		
		// 27. Write a program to check login credentials using nested if.

		Scanner sc = new Scanner(System.in);
		
		String correctUserName = "chandra";
		String correctPassword = "181818";
		
		System.out.println("Enter user name : ");
		String username = sc.nextLine();
		
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		
		if(username.equals(correctUserName))
		{
			
			if (password.equals(correctPassword))
			{
				System.out.println("Login Successfull.");
			}
			else
			{
				System.out.println("Incorrect Password.");
			}
		}
		else
		{
			System.out.println("Incorrect UserName.");
		}
	}
}
