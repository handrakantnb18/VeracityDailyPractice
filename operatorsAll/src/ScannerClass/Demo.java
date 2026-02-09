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
		
		// checking the age is eligible for the Driving or not
		
		System.out.println("Enter your age : ");
		
		int age1;
		
		age1 = sc.nextInt();
		
		String res = (age1 >= 18)? "Your are Eligible for Driving." : "You are not Eligible for the Driving.";
		
		System.out.println(res);
		
		
	}
}
