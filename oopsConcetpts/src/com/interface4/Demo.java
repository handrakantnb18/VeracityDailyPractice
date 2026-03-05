package com.interface4;

import com.interface3.*;

public class Demo implements Test {

	@Override
	public void login()
	{
		System.out.println("Login");
	}
	
	@Override
	public void register()
	{
		System.out.println("Register");
	}
	
	void m1()
	{
		
	}
}
