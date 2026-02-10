package IFElseStatement;

public class GreaterNumber3 {

	public static void main(String[] args) {
		// i have 3 numbers and find out the greater number from that
		// 344, 566, 677
		
		int num1 = 344, num2 = 566, num3 = 677;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Number one is greater");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("Number 2 is greater");
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("Number 3 is greater");
		}
		else {
			System.out.println("No number found");
		}
	}
}
