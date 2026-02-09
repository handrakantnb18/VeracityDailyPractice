package ScannerClass;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// checking the age is eligible for the voting or not
		
		System.out.println("Enter your age : ");
		
		int age;
		
		age = sc.nextInt();
		
		String result = (age >= 18)? "You are Eligible for the Voting" : " You are not Eligible for the Voting.";
		
		System.out.println(result);
		
		
	}
}
