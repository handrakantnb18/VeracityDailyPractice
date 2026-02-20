package DoWhileLoopTwentyOneToThirty;

public class EvenNumbers {

	public static void main(String[] args) {
		
		// 23. Print all even numbers from 1 to 100 using while loop.

		int i = 1;
		
		while (i <= 100) 
		{
			if (i % 2 == 0)
			{
				System.out.println("Evan Numbers are : "+i);
			}
			
			i++;
		}
	}
}
