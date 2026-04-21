package com.Day3.practice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = " i am from pune ";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
