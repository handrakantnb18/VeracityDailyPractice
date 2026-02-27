package com.linedin.coding;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
		// Read and Print an Integer using a Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		System.out.println("You entered : "+num);
	}
}
