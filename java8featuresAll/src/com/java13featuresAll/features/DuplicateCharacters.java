package com.java13featuresAll.features;

import java.util.HashMap;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str="chandrakant Going to pune";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        map.forEach((k,v)->{
            if(v>1)
                System.out.println(k+" = "+v);
        });
        
	}
}
