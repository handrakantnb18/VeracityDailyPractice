package com.java9featuresAll.features;

public class DuplicateCharactors {

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";

		for(int i = 0; i < str.length(); i++) {
		    for(int j = i + 1; j < str.length(); j++) {
		        if(str.charAt(i) == str.charAt(j)) {
		            System.out.println(str.charAt(i));
		            break;
		        }
		    }
		}
	}
}
