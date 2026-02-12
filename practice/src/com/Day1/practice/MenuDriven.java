package com.Day1.practice;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// Menu-Driven Program
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("1. Say Hello");
			System.out.println("2. say Bye");
			System.out.println("3. Exit");
			
			System.out.println("Enter Choice..");
			
			choice = sc.nextInt();
			
			if (choice == 1) 
				System.out.println("Chandrakant");
			else
				System.out.println("Bhosale");
			
		}while(choice != 3);
		
		sc.close();
	}
}
