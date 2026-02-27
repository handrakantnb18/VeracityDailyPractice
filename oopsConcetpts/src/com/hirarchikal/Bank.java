package com.hirarchikal;

public class Bank {

	double bankBalance;
	
	void calculateInterrest()
	{
		
	}
	
	void deposite(double amount)
	{
		if(amount > 0)
		{
			bankBalance += amount;
			System.out.println("Diposite success : "+bankBalance);
		}
		
	}
	
	void withdraw()
	{
		
	}
	
}
