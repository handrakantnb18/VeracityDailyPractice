package switchCaseOneToTen;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		// Check whether a number is even or odd using switch case.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		switch (num % 2) 
		{
			
			case 0:
				System.out.println("Number is prime.");
				break;
				
			case 1:
				System.out.println("Number is Odd. ");
				break;
				
				default :
					System.out.println("It is not number.");
					break;
		}
		
	}
}
