package com.Day3.practice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = " i am from pune ";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		
		String str1 = "my name is chandrakant";
		str1 = str1.replaceAll("\\s", "");
		System.out.println(str1);
		
		String str2 = "wel come to java programing";
		str2 = str2.replaceAll("\\s", "");
		System.out.println(str2);
	}
}
