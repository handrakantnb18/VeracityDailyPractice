package IFElseStatement;

import java.util.Scanner;

public class NestedIfUser {

	public static void main(String[] args) {

		// check balance, Deposite, Withdraw, Check Balance, Exit

		double bankBalance = 1000.00;

		System.out.println("1. Deposite");
		System.out.println("2. Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your choice 1 - 4 ");

		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Enter the amount for deposite. ");

			double amount = sc.nextDouble();
			if (amount > 0) {
				bankBalance += amount;

				System.out.println("Deposite success : " + bankBalance);

			} else {
				System.out.println("Invalid amount.");
			}
		} else if (choice == 2) {
			System.out.println("Enter the withdraw amount ");

			double amount = sc.nextDouble();

			if (amount > 0) {
				bankBalance -= amount;

				System.out.println("Withdraw success.");

			} else {
				System.out.println("Invalid amount.");
			}

		}
		

	}

}
