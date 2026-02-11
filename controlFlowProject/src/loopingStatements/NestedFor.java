package loopingStatements;

import java.util.Iterator;

public class NestedFor {

	public static void main(String[] args) {

		// Nested for loop first patter program

//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("A | ");
//			}
//			System.out.println();
//		}
		
		// print * in pattern
		
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// using if statement change the ROW or COLUMN diffrent conditons
				
		// change the conditon for 1 and 3 and 5 number line
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				
//				if (j == 3) {
//					System.out.print("0 ");
//				}
//				else if (j == 5) {
//					System.out.print("# ");
//				}
//				else if (j == 1) {
//					System.out.print("@ ");
//				}
//				else {
//					System.out.print("* ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		// print even number $ sign
		
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				
//				if (j % 2 == 0) {
//					System.out.print("$ ");
//				}
//				else {
//					System.out.print("* ");
//				}				
//				
//			}
//			System.out.println();
//		}
		
		// print Odd numbers $ sign 1 - 3 - 5- 7
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (j % 2 != 0) {
//					System.out.print("$ ");
//				}
//				else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
		
		// change condition using else if and if
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 1) {
					System.out.print("$ ");
				}
				else if (i == 1) {
					System.out.print("# ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}















