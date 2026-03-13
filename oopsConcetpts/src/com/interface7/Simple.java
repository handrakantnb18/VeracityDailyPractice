package com.interface7;

public class Simple implements DemoOne, DemoTwo, DemoFour {

	@Override
	public void run()
	{
		System.out.println("Run method");
	}
	
	@Override
	public void login()
	{
		System.out.println("Login method");
	}
	
	public void work()
	{
		System.out.println("Work method");
	}
	
	public static void main(String[] args) {
		
		Simple s = new Simple();
		
		s.run();
		s.login();
		s.work();
	}
}
