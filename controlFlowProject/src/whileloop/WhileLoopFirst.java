package whileloop;

import java.awt.Choice;
import java.util.Scanner;

public class WhileLoopFirst {

	public static void main(String[] args) {
		// ===================================================
		// Questions
		// 1. for loop program .... while loop
		// 2. Even numbers 1 to 100
		// 3. Odd numbers 1 to 100
		// 4. Sum of 1 to 100
		// 5. sum of only Even numbers from 1 to 100
		// ===================================================

		// while loop used for the reuse the condition
//		int i = 1;
//		
//		while(i <= 10) {
//			System.out.println("Ram");
//			i++;
//		}

		// Multiplication of the enter any number

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any Number : ");
//		
//		int num = sc.nextInt();
//		
//		if (num < 0) {
//			System.out.println("Invalid number..");
//		}
//		else {
//			int i = 1;
//			while (i <= 10) {
//				System.out.println(num * i);
//				i++;
//			}
//		}

		// give the attempt to user
		// re-comemnded while loop
		// simple Enter ATM PIN limited pin and access denied to check

//		int correctPin = 1818;
//		Scanner sc = new Scanner(System.in);
//		
//		int attempt = 0;
//		
//		while(attempt < 3) {
//			System.out.println("Enter ATM PIN : ");
//			int pin = sc.nextInt();
//			
//			if(correctPin == pin) {
//				System.out.println("Access Granted..");
//				break; // it is used to end your loop
//			}
//			else {
//				attempt++;
//				System.out.println("Wrong pin... Attempt Left "+(3-attempt));
//				
//				if(attempt == 3) {
//					System.out.println("Card Blocked.. due to multiple attempts.");
//				}
//			}
//			
//		}

		// Login system - userName and Password

		// Take userName and password from user until its correct

//		Scanner sc = new Scanner(System.in);
//		
//		String userName = "Chandr";
//		String password = "1818";
//		
//		String uname, pwd;
//		
//		while(true)
//		{
//			System.out.println("Enter User Name : ");
//			uname = sc.next();
//			
//			System.out.println("Enter password : ");
//			pwd = sc.next();
//			
//			if(userName.equals(uname) && password.equals(pwd))
//			{
//				System.out.println("Login Successfull.");
//				break;
//			}
//			else 
//			{
//				System.out.println("Invalid username and password.. Try again.");
//				
//			}
//		}

		// online food order system == e-commerce applications 
		// 1. pizza = (Rs. 400)
		// 2. Burger = (Rs. 250)
		// 3. VadaPav = (Rs. 30)
		// 4. MisalPav = (Rs. 100)

		// take choice
		// 1. take qty, 3 * 400 = 1200, ? 5000 -> 10% discount, total -> 1500 => 2% =>
		// Discount, Final Price, Product name, qty display

		
		// create simple bank app use it
		
		Scanner sc = new Scanner(System.in);

		double bankBalance = 2000;

		while (true) {
			System.out.println("1. Deposite.. ");
			System.out.println("2. Withdraw ");
			System.out.println("3. Check Balance ");
			System.out.println("4. Exit ");

			System.out.println("Enter your choice :  ");

			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter Deposite Amopunt..");
				int deposit = sc.nextInt();

				if (deposit > 0) {
					bankBalance += deposit;
					System.out.println("Deposit success : Balance " + bankBalance);
				} else {
					System.out.println("Invalid amount..");
				}
			}

			else if (choice == 2) {
				System.out.println("Enter withdraw amount...");
				int withdraw = sc.nextInt();

				if (withdraw > 0) {
					if (withdraw <= bankBalance) {
						bankBalance -= withdraw;
						System.out.println("Withdraw Success, Balance : " + bankBalance);

					} else {
						System.out.println("Insufficient balance..");
					}
				} else {
					System.out.println("Invalid amount...");
				}

			}

			else if (choice == 3) {
				System.out.println("Your bank balance is : " + bankBalance);
			}

			else if (choice == 4) {
				System.out.println("Thank you.");
				break;
			} else {
				System.out.println("Invalid choice");
			}
		}

	}
}
