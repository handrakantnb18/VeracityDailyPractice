package switchCaseOneToTen;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		
		// Print number in words for numbers 1 to 5 using switch case.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("One");
			break;
			
		case 2:
			System.out.println("Two");
			break;
			
		case 3:
			System.out.println("Three");
			break;
			
		case 4:
			System.out.println("Four");
			break;
			
		case 5:
			System.out.println("Five");
			break;
			
			default :
				System.out.println("Enter correct number 1 - 5");
				break;
		}
	}
}
