package loopingStatements;

public class NestedForNumbersPatterns {
	
	public static void main(String[] args) {
		
		
		// numbers patterns
		// print 1 to 5 all line with debugging
		
//		for (int i = 1; i <=5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				System.out.print(j+ " ");
//			}
//			System.out.println();
//		}
		
		
		// checking the condition print 3rd line * and &
		
//		for (int i = 1; i <=5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				if( i == 3) {
//					System.out.print("* ");
//				}
//				else if(j == 3) {
//					System.out.print("& ");
//				}
//				else {
//					System.out.print(j+ " ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
		// print 1 to 20 all numbers using num variable
		
		
//		for (int i = 1, num = 1; i <= 4; i++) 
//		{
//			for (int j = 1; j <= 5; j++) 
//			{
//				System.out.print(num + " ");
//				num++;
//			}
//			System.out.println();
//		}
		
		// using = i char data type type conversion done Alphabets as ASCII Value
		
//		for (int i = 65; i <=69; i++)
//		{
//			for (int j = 65; j <= 69; j++) 
//			{
//				System.out.print((char)i +" ");
//			}
//			System.out.println();
//		}
		
		// using = j char data type type conversion done Alphabets as ASCII Value
	
//		for( int i = 97; i <= 101; i++)
//		{
//			for(int j = 97; j <= 101; j++)
//			{
//				System.out.print((char)j+ " ");
//			}
//			System.out.println();
//		}
		
		// create number of the lines
		
//		for( int i = 1; i <= 2; i++)
//		{
//			for(int j = 97; j <= 122; j++)
//			{
//				System.out.print((char)j+ " ");
//			}
//			System.out.println();
//		}
		
//		// print using char data type horizontally
//		
//		for (char c='A'; c <= 'E'; c++) 
//		{
//			for (int i = 1; i <= 5; i++)
//			{
//				System.out.print(c+" ");
//			}
//			System.out.println();
//		}
		
		
		// print using char data type vortically
		
				for (int i= 1; i<= 5; i++) 
				{
					for (char c='A'; c<= 'E'; c++)
					{
						System.out.print(c+" ");
					}
					System.out.println();
				}
	}

}
