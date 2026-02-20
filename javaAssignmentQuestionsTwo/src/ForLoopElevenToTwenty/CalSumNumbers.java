package ForLoopElevenToTwenty;

public class CalSumNumbers {

	public static void main(String[] args) {
		
		// 16. Calculate sum of numbers from 1 to 100 using for loop.

		int sum = 0;
		
		for (int i = 1; i<= 50; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of the numbers : "+sum);
	}
}
