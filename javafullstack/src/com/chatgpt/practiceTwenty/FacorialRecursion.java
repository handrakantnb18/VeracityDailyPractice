package com.chatgpt.practiceTwenty;

public class FacorialRecursion {

	static int factorial(int n)
	{
		if(n == 0)
			return 1;
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) {
		// Find Factorial Using Recursion
		
		System.out.println(factorial(5));
	}
}
