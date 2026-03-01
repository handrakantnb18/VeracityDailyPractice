package com.chatgpt.practiceTwenty;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
    	
    	// Remove Duplicate Characters from String
    	
        String str = "programming";
        Set<Character> set = new LinkedHashSet<>();

        for(char ch : str.toCharArray())
            set.add(ch);

        StringBuilder result = new StringBuilder();
        for(char ch : set)
            result.append(ch);

        System.out.println(result);
    }

}
