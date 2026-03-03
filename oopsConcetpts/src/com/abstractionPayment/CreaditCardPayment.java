package com.abstractionPayment;


// CreaditCardPayment child class fourth class used in abstract method

public class CreaditCardPayment extends Payment {

	@Override
	void pay1(double amount)
	{
		showCompay();
		System.out.println("Payment of RS : "+ amount + " done using Creadit card.");
		
	}
}
