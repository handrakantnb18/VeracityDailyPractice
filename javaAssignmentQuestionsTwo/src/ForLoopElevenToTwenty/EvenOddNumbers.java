package ForLoopElevenToTwenty;

public class EvenOddNumbers {

	public static void main(String[] args) {

		// 13. Print all even numbers between 1 and 50 using for loop.

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print("Even Number : " + i);
			}
			else
			{
				System.out.print("Odd number  : "+i);
			}
			System.out.println();
		}
	}
}
