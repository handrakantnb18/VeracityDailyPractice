package IFElseStatement;

public class ElseIF {
	public static void main(String[] args) {
		
		
		// check the discount for the price
		
		double price = 30000.00;
		
		if (price > 10000) {
			System.out.println("Discount applied 10%");
		}
		else if (price > 7000) {
			System.out.println("Discount applied 7%");
		}
		else if (price > 2000) {
			System.out.println("Discount applied 2%");
		}
		else {
			System.out.println("No Discount.");
		}
	}
}
