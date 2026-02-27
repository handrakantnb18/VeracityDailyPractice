package com.hirarchikal;

public class Test extends Bank {

	public static void main(String[] args) {
		
		
		// code reusebility
		
		SBI sbi = new SBI();
		sbi.calculateInterrest();
		System.out.println(sbi.bankBalance);
		sbi.deposite(10000);
		
		HDFC hdfc= new HDFC();
		hdfc.calculateInterrest();
		System.out.println(hdfc.bankBalance);
		hdfc.deposite(40000);
		
		AXIS axis = new AXIS();
		axis.calculateInterrest();
		System.out.println(axis.bankBalance);
		axis.deposite(50000);
		
	}
}
