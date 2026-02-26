package com.Day2.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// Armstrong number
		
		int arm = 0, a,b,c,d,no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = sc.nextInt();
		d = no;
		
		while(no > 0)
		{
			a = no % 10; 
			no = no / 10;
			arm = arm + a * a *a;
		}
		if(arm == d)
		{
			System.out.println("Armstrong number.");
		}
		else
		{
			System.out.println("Not Armstrong number.");
		}
	}
}
