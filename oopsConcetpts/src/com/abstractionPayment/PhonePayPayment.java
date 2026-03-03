package com.abstractionPayment;


// PhonePayPayment child class third class used in abstract method

public class PhonePayPayment extends Payment {

	@Override
	void pay1(double amount)
	{
		showCompay();
		System.out.println("Payment of RS : "+ amount + " done using PhonePay.");
		
	}
}
