package com.j8features.java8coding;

public class FibonecciSeries {

	public static void main(String[] args) {
		
		// Fibonacci Series
		
		int a = 1, b = 2;
		
		for(int i = 1; i<=10; i++)
		{
			System.out.println(a + " ");
			
			int x = a  + b;
			a = b;
			b = x;
			
		}
	}
}
