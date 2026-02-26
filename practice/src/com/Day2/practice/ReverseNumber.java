package com.Day2.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		// reverse number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		int reverseNum = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;
			
		}
		System.out.println("Reverse number : "+reverseNum);

	}

}
