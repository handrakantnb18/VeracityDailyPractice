package switchCaseOneToTen;

import java.util.Scanner;

public class SeasonNameMonth {

	public static void main(String[] args) {
		// Print season name based on month number using switch case.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");

		int months = sc.nextInt();

		switch (months) {

		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Season : Summer");
			break;

		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Season : Mansoon");
			break;

		case 10:
		case 11:
		case 12:
		case 1:
			System.out.println("Season Winter");
			break;

		default:
			System.out.println("Invalid Month");
			break;
			
		}

	}
}
