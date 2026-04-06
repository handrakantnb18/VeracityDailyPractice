package IFElseStatement;

public class Discount {

	public static void main(String[] args) {
		
		double price = 5000.00;
		
		if(price > 10000)
		{
			System.out.println("Discount allpied 10% ");
		}
		else if(price > 7000)
		{
			System.out.println("Discount applied 7% ");
		}
		else if(price > 3000)
		{
			System.out.println("Price applied 3%");
		}
		else
		{
			System.out.println("No Discount");
		}
	}
}
