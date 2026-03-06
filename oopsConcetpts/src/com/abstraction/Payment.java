package com.abstraction;

public abstract class Payment {

	// abstract method pay
	
	public Payment()
	{
	
		System.out.println("Payment constructor");
	}
	// abstract void payAmount();
	
	abstract void pay(double amount);
	
	abstract void UPIPayment1(double amount);
	
}
