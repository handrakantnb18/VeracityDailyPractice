package com.abstraction;

public class Test extends Student {

	
	// abstract methods are override
	
	@Override
	void login(int x)
	{
		
	}
	
	@Override
	void register()
	{
		
	}
	
	@Override
	void work()
	{
		
	}
	
	@Override
	void m1()
	{
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.login(0);
		t.register();
		t.work();
		
		
	}
}
