package loopingStatements;

import java.util.Iterator;

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
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}

}
