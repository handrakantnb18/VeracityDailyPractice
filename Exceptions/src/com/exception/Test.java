package com.exception;

import java.util.Scanner;

public class Test {

	
	// AgeNotValidException
	// AmountNotValidException
	// UserNotValidException
	// EmployeeNotFountException
	// ProductNotFoundException
	
	
	void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		if(age < 18)
		{
			throw new AgeNotValidException("Age is not eligible.");
		}
		else
		{
			System.out.println("Eligible for the voting..");
			
		}
			
	}
	public static void main(String[] args) {
		Test t = new Test();
		try
		{
			t.check();
		}
		catch(AgeNotValidException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
