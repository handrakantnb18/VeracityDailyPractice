package DoWhileLoopThirtyOneToFourty;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {

		// 39. Count digits of a number using do-while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");

		int num = sc.nextInt();

		int count = 0;

		if (num < 0) {
			num = -num;
		}

		do {
			num = num / 10;
			count++;
		} while (num != 0);

		System.out.println("Number Digit : " + count);

	}
}
