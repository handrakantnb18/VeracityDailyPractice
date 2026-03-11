package com.inheritancepractice;

public class Loing extends Son {

	void display()
	{
		super.pay();
		System.out.println("Child class for all");
	}
	
	public static void main(String[] args) {
		
		Loing l = new Loing();
		
		l.display();
	}
}
