package com.java14featuresAll.features;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 24;
		
		boolean prime = true;
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n % i == 0)
			{
				prime = false;
				break;
			}
		}
		
		System.out.println(prime?"Prime":"Not Prime");
		
	}
}
