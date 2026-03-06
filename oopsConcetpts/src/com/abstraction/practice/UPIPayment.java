package com.abstraction.practice;

public class UPIPayment extends Payment {

	void Login(double amount)
	{
		System.out.println("Login "+amount);
	}
	
	void register(double amount)
	{
		System.out.println(" "+amount);
	}
	
	void work(String name)
	{
		System.out.println("Name of "+name);
	}
	
	public static void main(String[] args) {
		
		UPIPayment upi = new UPIPayment();
		
		upi.Login(100);
		
		upi.register(5000);
		
		upi.name("Chandraknt");
	}

	private void name(String string) {
		// TODO Auto-generated method stub
		//System.out.println("Name is "+name);
	}
}
