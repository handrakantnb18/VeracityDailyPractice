package com.demo;

public class Employee implements Runnable {

	@Override
	public void run() {
		
		String str = "my name is chandraknt bhosale";
		
		char []c = str.toCharArray();
		
		for(int i=0; i<c.length; i++)
		{
			try
			{
			Thread.sleep(200);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.print(c[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		Thread t1 = new Thread(employee);
		t1.start();
	}
}
