package DoWhileLoopThirtyOneToFourty;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {

		// 33. Print even numbers between 1 and 20 using do-while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");

		int num = sc.nextInt();

		int i = 1;

		do {
			if (i % 2 == 0) {
				System.out.println(i);

			}

			i++;
		} while (i <= 20);
	}

}
