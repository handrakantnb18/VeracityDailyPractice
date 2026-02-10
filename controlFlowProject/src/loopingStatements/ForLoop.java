package loopingStatements;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// 1 lakh line code in = 1 line = looping statement

//		for (int i = 1; i < 10; i++) {
//			System.out.println("Server is down "+i);
//		}

		// 1 to 10 print
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}

		// print 10 to 1

//		for (int i = 10; i >=1; i--) {
//			System.out.println(i);
//		}

		// checked Even numbers
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//
//		}

		// print odd numbers
//		for (int i = 1; i <= 50; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}

		// increment
//		for (int i = 1; i <= 50; i += 5) {
//
//			System.out.println(i);
//
//		}

		// decrement
//		for (int i = 100; i <= 1; i -= 5) {
//
//			System.out.println(i);
//
//		}
		
		// check the condition of the num * i 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		
		// checking condition dont use (-) minus number
		if (num <= 0) {
			System.out.println("Invalid number");
		}
		else
		{
			for(int i = 1; i <=10; i++) {
				System.out.println(num+" * "+i+ " = " +num * i);
			}
		}
		
	}

}
