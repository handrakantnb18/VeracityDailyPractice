package com.predefinedjavagenerics;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, String> f =(i) ->
		{
			return "Chandrakant";
		};
		
		System.out.println(f.apply(100));
	}
}
