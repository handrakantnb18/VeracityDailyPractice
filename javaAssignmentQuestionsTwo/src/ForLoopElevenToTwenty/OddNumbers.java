package ForLoopElevenToTwenty;

public class OddNumbers {

	public static void main(String[] args) {
		
		// 14. Print all odd numbers between 1 and 50 using for loop.

		for (int i = 1; i <= 50; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println("Odd Numbers : "+i);
			}
			// System.out.println();
		}
		
	}
}
