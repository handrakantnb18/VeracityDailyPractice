package com.java15featuresAll.features;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepet {

	public static void main(String[] args) {
		
		String str = "kjcjhdca";

        Set<Character> set = new HashSet<>();

        Character chara = str.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> !set.add(c))
                .findFirst()
                .get();

        System.out.println(chara);

		
	}
}
