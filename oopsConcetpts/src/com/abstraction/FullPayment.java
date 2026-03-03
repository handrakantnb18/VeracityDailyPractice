package com.abstraction;

public class FullPayment extends Payment {

	
	// overriding method and child class
	
	@Override
	void pay(double amount)
	{
		
	}
	
	@Override
	void UPIPayment1(double amount)
	{
		
	}
	
	public static void main(String[] args) {
		
		FullPayment p = new FullPayment();
		p.pay(100);
		p.UPIPayment1(5000);
	}
}
