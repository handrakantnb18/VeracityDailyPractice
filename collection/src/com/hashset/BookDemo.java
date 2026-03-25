package com.hashset;

import java.util.HashSet;

public class BookDemo {

	public static void main(String[] args) {
		
		HashSet<Book> hs = new HashSet<Book>();
		
		hs.add(new Book(1, "java", "James gosling", 500, 10));
		hs.add(new Book(2, "Rich Dad Poor Dad", "Robert kiyosaki", 225, 25));
		hs.add(new Book(3, "Atomatic Habits", "James Clear", 180, 11));
		hs.add(new Book(4, "Think and Grow Rich", "Napoleon Hill", 555, 15));
		hs.add(new Book(5, "The power of positive thinking", "Norman vincent peale", 300, 10));
		hs.add(new Book(6, "ABC", "abc", 100, 50));
		
		System.out.println(hs);
		
	}
}
