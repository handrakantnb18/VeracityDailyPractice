package IFElseStatement;

public class Discount {

	public static void main(String[] args) {
		
		double price = 5000.00;
		
		if(price > 10000)
		{
			System.out.println("Discount allpied 10% ");
			double discount = price * 0.10;
			System.out.println("Total Discount : "+discount);
			System.out.println("Final price : "+(price - discount));
			
		}
		else if(price > 7000)
		{
			System.out.println("Discount applied 7% ");
			double discount = price * 0.07;
			System.out.println("Total Discount : "+discount);
			System.out.println("Final price : "+(price - discount));
			
		}
		else if(price > 3000)
		{
			System.out.println("Price applied 3%");
			double discount = price * 0.03;
			System.out.println("Total Discount : "+discount);
			System.out.println("Final price : "+(price - discount));
			
		}
		else
		{
			System.out.println("No Discount");
		}
	}
}
