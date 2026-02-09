package IFElseStatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
//		
//		if (false) {
//			System.out.println("Hello");
//		}
//		else {
//			System.out.println("Hii");
//		}

		Scanner sc = new Scanner(System.in);

		// check the odd and even number

		System.out.println("Enter any number : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even number.");
		} else {
			System.out.println("Odd number.");
		}

		// check the condition of eligibility of Voting

//		System.out.println("Enter your age : ");
//		
//		int age = sc.nextInt();
//		
//		if (age >= 18) {
//			System.out.println("Eligible for Voting");
//		}
//		else {
//			System.out.println("Not Elligible for the Voting.");
//		}
	}
}
