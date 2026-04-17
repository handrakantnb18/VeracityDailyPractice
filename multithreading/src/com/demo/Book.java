package com.demo;

public class Book implements Runnable {

	String str = "my name is chandrakant Bhosale";
	
	char []c= str.toCharArray();
	
	@Override
	public void run() {
	
		for(int i=1;i<c.length;i++)
		{
			try
			{
			Thread.sleep(300);
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.print(" "+i+" = "+c[i]+", ");
//			System.out.println();
//			System.out.print(c[i]);

		}
		
	}
	
	public static void main(String[] args) {
		
		Book b = new Book();
		
		Thread t1 = new Thread(b);
		t1.start();
	}
}
