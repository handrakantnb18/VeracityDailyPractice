package com.abstractionPayment;


// PaymentDemo main class and main method created Object

public class PaymentDemo {

	public static void main(String[] args) {
		
		Payment p1 = new UPIPayment();
		p1.pay1(100000);
		
		Payment p2 = new CreaditCardPayment();
		p2.pay1(200000);
		
		Payment p3 = new PhonePayPayment();
		p3.pay1(500000);
		
	}
}
