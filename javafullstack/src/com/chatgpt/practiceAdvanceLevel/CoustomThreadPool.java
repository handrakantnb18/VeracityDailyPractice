package com.chatgpt.practiceAdvanceLevel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CoustomThreadPool {

	public static void main(String[] args) {
		// Implement Custom Thread Pool
		
		ExecutorService servise = Executors.newFixedThreadPool(3);
		
		for (int i = 1; i <= 5; i++)
		{
			int task = i;
			servise.execute(() ->{
				System.out.println("Excuting task : "+task);
			});
		}
		servise.shutdown();
	}
}
