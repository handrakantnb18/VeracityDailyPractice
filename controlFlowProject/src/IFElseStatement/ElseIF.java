package IFElseStatement;

public class ElseIF {
	public static void main(String[] args) {
		
		
		// check the discount for the price and discounted price
		
		double price = 1000.00;
		
		if (price > 10000) {
			System.out.println("Discount applied 10%");
			double discount = price * 0.10;
			System.out.println("Discounted amount : "+discount);
			System.out.println("Final price : "+(price - discount));
		}
		else if (price > 7000) {
			System.out.println("Discount applied 7%");
			double discount = price * 0.07;
			System.out.println("Discounted amount : "+discount);
			System.out.println("Final price : "+(price - discount));
		}
		else if (price > 2000) {
			System.out.println("Discount applied 2%");
			double discount = price * 0.02;
			System.out.println("Discounted amount : "+discount);
			System.out.println("Final price : "+(price - discount));
		}
		else {
			System.out.println("No Discount.");
		}
	}
}
