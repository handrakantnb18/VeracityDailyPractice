package conditionalStatements;

import java.util.Scanner;

public class SimpleTwo {

	public static void main(String[] args) {
		
		
		// check the number is positive or Negative number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("Number is positive");
		}
		
		if (num < 0) {
			System.out.println("Number is Negative.");
		}
		
		if (num == 0) {
			System.out.println("Number is Zero.");
		}
	}
}
