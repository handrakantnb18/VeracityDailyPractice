package com.interface4;

public class Simple implements DemoOne, DemoTwo , DemoThree
{

	public static void main(String[] args) {
		Simple s = new Simple();

		s.m3();
		s.work();
		s.login();
		s.fun();

		// DemoOne.m1();
	}

	@Override
	public void login()
	{
		System.out.println("Login");
	}
	
	@Override
	public void fun() 
	{
		System.out.println("Run");
	}
	
	@Override
	public void work()
	{
		System.out.println("Work");
	}

}
