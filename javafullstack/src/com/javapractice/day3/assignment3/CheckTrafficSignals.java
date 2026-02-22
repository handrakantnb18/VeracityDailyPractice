package com.javapractice.day3.assignment3;

import java.util.Scanner;

public class CheckTrafficSignals {

	public static void main(String[] args) {
		
		// 23. Write a program to check traffic signal color and display action.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Traffic signals : ");
		
		String color = sc.nextLine();
		
		if(color.equalsIgnoreCase("Red"))
		{
			System.out.println("Stop");
		}
		else if (color.equalsIgnoreCase("Yello"))
		{
			System.out.println("Get Ready");
		}
		else if (color.equalsIgnoreCase("Green"))
		{
			System.out.println("Go");
		}
		else
		{
			System.out.println("Invalid signal color.");
		}
	}
}
