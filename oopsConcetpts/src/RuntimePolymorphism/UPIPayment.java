package RuntimePolymorphism;

public class UPIPayment extends Payment {

	@Override // Annotaion - it show the extra information
	void pay()
	{
		super.pay();
		System.out.println("pay using UPI.");
	}
	
	public static void main(String[] args) {
		UPIPayment upi = new UPIPayment();
		upi.pay();
				
	}
}
