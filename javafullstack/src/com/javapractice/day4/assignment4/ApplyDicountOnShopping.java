package com.javapractice.day4.assignment4;

import java.util.Scanner;

public class ApplyDicountOnShopping {

	public static void main(String[] args) {
		
		// 33. Write a program to apply discount based on shopping amount.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Shopping Amount : ");
		double amount = sc.nextDouble();
		
		double discount = 0;
		
		if(amount >= 5000)
		{
			discount = amount * 0.10;
		}
		else if (amount >= 3000)
		{
			discount = amount * 0.05;
		}
		else if (amount >= 1000)
		{
			discount = amount * 0.02;
		}
		else
		{
			discount = 0;
		}
		
		double finalAmount = amount - discount;
		
		System.out.println("Discount : "+ discount);
		System.out.println("Final amount to pay : "+ finalAmount);
		
	}
}
