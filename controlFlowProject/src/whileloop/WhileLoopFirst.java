package whileloop;

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
		
		int correctPin = 1818;
		Scanner sc = new Scanner(System.in);
		
		int attempt = 0;
		
		while(attempt < 3) {
			System.out.println("Enter ATM PIN : ");
			int pin = sc.nextInt();
			
			if(correctPin == pin) {
				System.out.println("Access Granted..");
				break; // it is used to your loop
			}
			else {
				attempt++;
				System.out.println("Wrong pin... Attempt Left "+(3-attempt));
				
				if(attempt == 3) {
					System.out.println("Card Blocked.. due to multiple attempts.");
				}
			}
			
		}
	}
}
