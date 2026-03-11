package com.polymorphism;

public class UPIPayment extends Payment {

	@Override
	void login()
	{
		super.login();
		System.out.println("Chandrakant");
	}
	
	
	@Override
	void register()
	{
		super.register();
		System.out.println("Id is : 101 ");
	}
	
	public static void main(String[] args) {
		UPIPayment upi = new UPIPayment();
		upi.login();
		upi.register();
	}
}
