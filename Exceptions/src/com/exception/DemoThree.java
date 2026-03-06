package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoThree {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		
		try
		{
			int age = sc.nextInt();
			
			System.out.println("Age is : "+age);
		}
		catch(InputMismatchException i)
		{
			System.out.println(i.getMessage());
		}
	}
}
