package com.main;

import com.book.Book;
import com.controller.BookController;

public class BookMain {

	// 2. Book -- id, name, price, auther, qty, mfgdate, expand
	// insert, updated, delete, get. getAll
	
	public static void main(String[] args) {
		
		BookController controller = new BookController();
		
		// insert book info
		
		try
		{
			Book b1 = new Book(1, "Java Programming", 550, "James Gosling", 10, "2020-01-10", "java");
			Book b2 = new Book(2, "The Alchemist", 399, "Paulo Coelho", 12, "2018-01-10", "Alchemist");
			Book b3 = new Book(3, "Rich Dad Poor Dad", 450, "Robert Kiyosaki", 10, "2019-03-12", "Rich/Poor");
			Book b4 = new Book(4, "Atomic Habits", 520, "James Clear", 15, "2020-06-25", "Habits");
			Book b5 = new Book(5, "Think and Grow Rich", 350, "Napoleon Hill", 9, "2017-09-05", "Grow Rich");
			
			
			String msg1 = controller.insertBook(b1);
			String msg2 = controller.insertBook(b2);
			String msg3 = controller.insertBook(b3);
			String msg4 = controller.insertBook(b4);
			String msg5 = controller.insertBook(b5);
			
			
			System.out.println(msg1);
			System.out.println(msg2);
			System.out.println(msg3);
			System.out.println(msg4);
			System.out.println(msg5);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// update books
		
		
	}
}
