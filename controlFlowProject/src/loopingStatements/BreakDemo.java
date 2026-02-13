package loopingStatements;

public class BreakDemo {

	public static void main(String[] args) {

		// Break => break is used to end the loop, for, while, do in java
		// you can use loop only

//		for(int i=1; i<=10; i++)
//		{
//			
//			if (i == 4)
//			{
//				break;  // END
//			}
//			System.out.println(i);
//			
//		}
//		

		// continue statement
		// continue is used to skip the condition / iteration and go for next iteration

		for (int i = 1; i <= 10; i++) {

			if (i == 4 || i == 6) {
				continue; // END
			}
			System.out.println(i);

		}

	}
}
