package loopingStatements;

public class DoWhile {

	public static void main(String[] args) {
		// entry control point
		
//		for (int i=1; i<=10; i++) // ENTRY Point
//		{
//			System.out.println("Hello");
//		}
		
		// Do while loop is Exit control loop
		
		
		// Do While loop  check condition ins change using i++;
//		int i = 1;
//		
//		do {
//			System.out.println("Hello");
//			i++;
//		}while(i <= 10);
		
		// print Even and Odd numbers
		
//		int i = 1;
//		
//		do {
//			if (i % 2 != 0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}while(i <= 10);
		
		// print only those numbers which are divisible by 3 and 5
		
		int i = 1;
		
		do {
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(i);
			}
			i++;
		}while(i <= 200);
		
		
	}
}
