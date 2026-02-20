package switchCaseOneToTen;

import java.util.Scanner;

public class WeekdayNumber {

	public static void main(String[] args) {
		// 10. Convert weekday number into weekday/weekend using switch case.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");

		int day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednsaday");
			break;

		case 4:
			System.out.println("Thrusday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid Day");
			break;
			
		}

	}
}
