package com.exception;

import java.io.IOException;

public class DemoNumber {

	public static void main(String[] args) {
		
		
		try
		{
			int arr[] = new int[10];
			arr[0] = 11;
			arr[1]=22;
			arr[20]=100;
		}
		catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("Chandrakant");
		System.out.println("Priyanka");
	}
}
