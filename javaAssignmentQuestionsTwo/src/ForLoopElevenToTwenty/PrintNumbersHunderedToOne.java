package ForLoopElevenToTwenty;

public class PrintNumbersHunderedToOne {

	public static void main(String[] args) {
		// 12. Print numbers from 100 to 1 using for loop.
		
		for (int i = 100; i >= 1; i--)
		{
			System.out.print("| "+i);
			if (i % 10 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
