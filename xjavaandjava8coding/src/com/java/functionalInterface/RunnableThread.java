package com.java.functionalInterface;

public class RunnableThread {

	// developers had to use anonymous inner classes to
	// provide interface implementations. Here’s how the same
	// Runnable example would look:
	
	
	public static void main(String[] args) {
		
		 // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    
	}
}
