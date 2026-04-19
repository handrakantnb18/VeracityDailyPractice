package com.atwo;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int n = 5;
		int fact = 1;
		
		for(int i=1;i<=n;i++)
		{
			fact *= i;
		}
		System.out.println(fact);
		
		int m = 8;
		int fact1 = 1;
		
		for(int j=1;j<=m;j++)
		{
			fact1 *= j;
		}
		System.out.println(fact1);
	}
}
