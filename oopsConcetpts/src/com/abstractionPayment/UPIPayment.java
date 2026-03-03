package com.abstractionPayment;


// UPIPayment child class second class used in abstract method 

public class UPIPayment extends Payment {

	@Override
	void pay1(double amount)
	{
		showCompay();
		System.out.println("Payment of RS : "+ amount + " done using UPI.");
		
	}
}
