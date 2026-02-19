package switchCaseOneToTen;

import java.util.Scanner;

public class PrintDayName {

	public static void main(String[] args) {
		// 1. Write a Java program to print day name using day number (1–7) using switch
		// case.

		// int case= 0;
		
		int day1 = 1;
		
		switch(day1) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wendsday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day ");
		int day = sc.nextInt();

		switch (day) {

		case 1:
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wendsaday");
			break;

		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
			default :
				System.out.println("Please Enter Correct day.");
				
				break;
		}
	}

}
