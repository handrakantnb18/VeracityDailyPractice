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
				
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				
				if (i == 3) {
					System.out.print("0 ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}















