package com.Day3.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepetedCharactor {

	public static void main(String[] args) {
		
		String str1 = "cchandraakknt";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c: str1.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c: map.keySet())
		{
			if(map.get(c) == 1)
			{
				System.out.println(c);
				break;
			}
		}
	}
}
