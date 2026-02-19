package switchCaseOneToTen;

import java.util.Scanner;

public class MonthNameOne {

	public static void main(String[] args) {

		// Print month name using month number using switch case.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Month Number : ");
		int months = sc.nextInt();

		switch (months)

		{
		case 1:
			System.out.println("1. January ");
			months++;
			break;

		case 2:
			System.out.println("2. Februvary ");
			break;

		case 3:
			System.out.println("3. March ");
			break;

		case 4:
			System.out.println("4. April ");
			break;

		case 5:
			System.out.println("5. May ");
			break;

		case 6:
			System.out.println("6. June ");
			break;

		case 7:
			System.out.println("7. July ");
			break;

		case 8:
			System.out.println("8. Augest ");
			break;

		case 9:
			System.out.println("9. September ");
			break;

		case 10:
			System.out.println("10 Octomber ");
			break;

		case 11:
			System.out.println("11. November ");
			break;

		case 12:
			System.out.println("12. December ");
			break;

		default:
			System.out.println("Enter correct month 1 - 12 ");
			break;

		}
	}
}
