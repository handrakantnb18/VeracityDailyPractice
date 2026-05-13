package com.java.a8features.main;

import java.util.stream.Stream;

public class InfiniteStreamDemo {

	public static void main(String[] args) {
		
		 Stream.iterate(1, n -> n + 1)
         .limit(5)
         .forEach(System.out::println);

	}
}
