package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckSeatAvailabe {

	public static void main(String[] args) {
		
		//49. Write a program to check seat availability.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter seat in number : ");
		int seat = sc.nextInt();
		
		if (seat > 0)
		{
			System.out.println("Seat is availabe.");
		}
		else
		{
			System.out.println("Seat is not availabe.");
		}
	}
}
