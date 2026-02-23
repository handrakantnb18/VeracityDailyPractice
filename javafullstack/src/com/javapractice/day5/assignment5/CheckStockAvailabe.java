package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckStockAvailabe {

	public static void main(String[] args) {
		
		// 42. Write a program to check if stock is available.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Stock Number : ");
		int stock = sc.nextInt();
		
		if(stock > 0)
		{
			System.out.println("Stock is available.");
		}
		else
		{
			System.out.println("Stock is not availabe.");
		}
	}
}
