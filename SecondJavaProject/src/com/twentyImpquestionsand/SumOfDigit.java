package com.twentyImpquestionsand;

public class SumOfDigit {

	public static void main(String[] args) {
		int num = 123456789;
		int sum = 0;
		
		while(num != 0)
		{
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("Sum of Digits : "+sum);
	}
}
