package com.corejava.xjavaandjava8coding;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 13;
		boolean prime = true;
		
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				prime = false;
				break;
			}
		}
		
		if(prime)
			System.out.println("Prime number");
		else
			System.out.println("Not Prime number.");
		
		
	}
}
