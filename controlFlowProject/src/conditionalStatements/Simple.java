package conditionalStatements;

import java.util.Scanner;

public class Simple {
	
	public static void main(String[] args) {
		 
		// 10 > 20 condition true or false boolean value
		
		// check the age less than 18, greater than 18 and grether than 45
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		
		int age = sc.nextInt();
		
		if (age >= 18 && age <= 45) {
			System.out.println("Your are young..");
		}
		
		if (age <= 18 ) {
			System.out.println("You are minor.");
		}
		if (age >= 45) {
			System.out.println("You are old");
		}
		
//		if (10 < 20) {
//			System.out.println("Hello");
//		}
//		
//		if (10 > 20) {
//			System.out.println("Good");
//		}
//		
//		System.out.println("Welcome");
//		
		// check the age for the eligibility
		
//		int age = 25;
//		
//		if (age > 18) {
//			System.out.println("Your are eleigible");
//		}
//		
//		if (age < 10) {
//			System.out.println("You are not Eligible");
//		}
		
	}
	

}
