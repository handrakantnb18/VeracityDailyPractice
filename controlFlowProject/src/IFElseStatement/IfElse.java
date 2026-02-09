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
		
		// check the condition of eligibility of Voting

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not Elligible for the Voting.");
		}
	}
}
