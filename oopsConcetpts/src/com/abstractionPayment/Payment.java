package com.abstractionPayment;


// Payment parent class used in abstract method

public abstract class Payment {

	String name = "Chandrakant bhosale";
	
	abstract void pay1(double amount);
	
	
	void showCompay()
	{
		System.out.println("Company : "+name);
	}
}
