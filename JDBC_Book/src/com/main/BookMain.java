package com.main;

import java.util.ArrayList;

import com.book.Book;
import com.controller.BookController;
import com.exception.SomethingWentWrongException;

public class BookMain {

	// 2. Book -- id, name, price, auther, qty, mfgdate, expand
	// insert, updated, delete, get. getAll
	
	public static void main(String[] args) {
		
		BookController controller = new BookController();
		
		// insert book info
		
//		try
//		{
//			Book b1 = new Book(1, "Java Programming", 550, "James Gosling", 10, "2020-01-10", "java");
//			Book b2 = new Book(2, "The Alchemist", 399, "Paulo Coelho", 12, "2018-01-10", "Alchemist");
//			Book b3 = new Book(3, "Rich Dad Poor Dad", 450, "Robert Kiyosaki", 10, "2019-03-12", "Rich/Poor");
//			Book b4 = new Book(4, "Atomic Habits", 520, "James Clear", 15, "2020-06-25", "Habits");
//			Book b5 = new Book(5, "Think and Grow Rich", 350, "Napoleon Hill", 9, "2017-09-05", "Grow Rich");
//			
//			
//			String msg1 = controller.insertBook(b1);
//			String msg2 = controller.insertBook(b2);
//			String msg3 = controller.insertBook(b3);
//			String msg4 = controller.insertBook(b4);
//			String msg5 = controller.insertBook(b5);
//			
//			
//			System.out.println(msg1);
//			System.out.println(msg2);
//			System.out.println(msg3);
//			System.out.println(msg4);
//			System.out.println(msg5);
//			
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
		// update books
		
//		try
//		{
//			Book b10 = new Book(1, "The Power of Habit", 480, "Charles Duhigg", 8, "2021-02-18", "Habit");
//			
//			String msg = controller.update(b10);
//			
//			System.out.println(msg);
//		}
//		catch(SomethingWentWrongException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		
		// delete single book into table
		
//		try
//		{
//			System.out.println(controller.delete(1));
//			
//		}catch(SomethingWentWrongException e)
//		{
//			e.printStackTrace();
//		}
//		
		
		
		// get single Book into table
		
		try
		{
			
			Book book = controller.get(4);
			
			System.out.println(book);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		// getAll Books into table
		
		
//		try
//		{
//			ArrayList<Book> all = controller.getAll();
//			
//			for(Book bk : all)
//			{
//				
//				System.out.println("ID : "+bk.getId());
//				System.out.println("Name : "+bk.getName());
//				System.out.println("Price : "+bk.getPrice());
//				System.out.println("Auther : "+bk.getAuther());
//				System.out.println("Qty : "+bk.getQty());
//				System.out.println("Mfgdate : "+bk.getMfgdate());
//				System.out.println("Expand : "+bk.getExpand());
//				
//				System.out.println(" ------------------------- ");
//			}
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
		
	}
}
