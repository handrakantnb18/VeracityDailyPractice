package com.chatgpt.practice;

public class CheckNumberPrime {

	public static void main(String[] args) {
		// Check number is prime
		
		int num = 7;
		boolean isPrime = true;
		
		if (num <= 1)
		{
			isPrime = false;
		}
		else
		{
			for (int i = 2; i <= num/2; i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		
		if (isPrime)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
}
