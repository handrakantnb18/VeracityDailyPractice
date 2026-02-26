package com.Day2.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		// reverse string
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter World : ");
		
		String a = "Chandrakant ";
		String reverse = " ";
		
		for(int i = a.length() - 1; i >= 0; i--)
		{
			reverse = reverse + a.charAt(i);
		}
		
		System.out.println("Reverse String : "+reverse);
	}
}
