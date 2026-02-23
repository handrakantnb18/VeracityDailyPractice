package com.javapractice.day5.assignment5;

import java.util.Scanner;

public class CheckLightOnOff {

	public static void main(String[] args) {
		
		// 46. Write a program to check if a light is ON or OFF.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Is light ON / OFF : ");
		boolean isOn = sc.nextBoolean();
		
		if (isOn)
		{
			System.out.println("Light is ON.");
		}
		else
		{
			System.out.println("Light is OFF.");
		}
	}
}
