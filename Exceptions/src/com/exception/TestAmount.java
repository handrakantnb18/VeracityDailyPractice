package com.exception;

import java.util.Scanner;

public class TestAmount {

	void amount(double amount) throws AmountNotValidException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		
		double amount1 = sc.nextDouble();
		
		if(amount <= 0)
		{
			throw new AmountNotValidException("Amount must be greater than zero. ");
		}
		System.out.println("Payment Successful : "+amount);
	}
	
	public static void main(String[] args) {
		
		TestAmount ta = new TestAmount();
		
		try 
		{
			ta.amount(-500);
		}
		catch(AmountNotValidException a)
		{
			System.out.println(a.getMessage());
		}
	}
	
}
