package com.interface6;

public class Simple implements DemoOne, DemoTwo, DemoThree {

	@Override
	public void run()
	{
		System.out.println("Run method we have used ");
	}
	
	@Override
	public void work()
	{
		System.out.println("Work method");
	}
	
	@Override
	public void Login()
	{
		System.out.println("Login method");
	}
	
	public static void main(String[] args) {
		Simple s = new Simple();
		
		s.run();
		s.work();
		s.Login();
		
		
	
	}
}
