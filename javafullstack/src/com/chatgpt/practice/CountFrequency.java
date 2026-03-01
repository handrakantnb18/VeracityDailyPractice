package com.chatgpt.practice;

import java.util.HashMap;

public class CountFrequency {

	public static void main(String[] args) {
		// Count Frequency of Charactors in String
		
		String str = "Chandraaknt";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char ch : str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(map);
	}
}
