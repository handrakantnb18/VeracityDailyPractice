package com.Day1.practice;

import java.util.Scanner;

public class CheckTemperator {
	public static void main(String[] args) {
		
		// Check Temperator is high
		
		Scanner sc = new Scanner(System.in);
		int temperature;
		
		do {
			
			System.out.println("Enter temperature :");
			temperature = sc.nextInt();
			
			if (temperature > 35) {
				System.out.println("temperature is High");
			}
			else {
				System.out.println("temperature is Normal");
				break;
			}
			
		}while(temperature >= 0);
		sc.close();
	}

}
