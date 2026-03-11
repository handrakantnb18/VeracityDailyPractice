package com.inheritancepractice;

public class Dept extends Child {

	// Single inheritance
	
	void admin()
	{
		
		super.childmain();
		System.out.println("Child class access prperties from parent");
	}
	
	public static void main(String[] args) {
		//Employee e =new Employee();
		
		
		Dept d = new Dept();
		d.admin();
		//d.emp();
		
		//Child c = new Child();
		//c.childmain();
	}
}
