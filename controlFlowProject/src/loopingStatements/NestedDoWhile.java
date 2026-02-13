package loopingStatements;

public class NestedDoWhile {

	public static void main(String[] args) {

		// Nested Do While Check the condition

		// check condition only

//		int i = 1;
//		
//		do {
//			
//			System.out.println("Chandr");
//			i++;
//			
//			int j = 1;
//			do {
//				System.out.println("Bhosale");
//				j++;
//			}while (j <= 5);
//			
//		}while (i <= 5);

		// print the 2 to 10 multiplication

//		int i = 1;
//
//		do {
//
//			int j = 2;
//			do {
//				System.out.print(i * j + "\t");
//				j++;
//			} while (j <= 10);
//
//			System.out.println();
//			i++;
//
//		} while (i <= 10);
		
		// print * pattern
		
		int i = 1;

		do {

			int j = 1;
			do {
				System.out.print("* ");
				j++;
			} while (j <= 5);

			System.out.println();
			i++;

		} while (i <= 5);
	}
}
