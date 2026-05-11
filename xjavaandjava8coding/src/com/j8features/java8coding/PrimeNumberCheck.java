package com.j8features.java8coding;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		// Prime Number Check
		
		int num = 9;
		boolean prime = true;
		
		for(int i = 2; i<= num/2;i++)
		{
			if(num % i == 0)
			{
				prime = false;
				break;
			}
		}
		
		if(prime)
			System.out.println("Prime Number");
		
		else
			System.out.println("Not Prime Number");
		
	}
}
