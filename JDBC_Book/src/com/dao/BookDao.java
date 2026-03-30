package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.book.Book;
import com.util.JDBCUtil;

public class BookDao {

//	public static void main(String[] args) {
//		
//		BookDao dao = new BookDao();
//		
//		dao.createTable();
//		
//	}
	
	Connection conn = JDBCUtil.createConnection();
	
	// create table book
	
//	public void createTable()
//	{
//		try
//		{
//			Statement stmt = conn.createStatement();
//		
//			stmt.execute("create table book (id int, name varchar(34), price int, auther varchar(50), qty int, mfgdate varchar(50), expand varchar(50) )");
//		
//			System.out.println("Table created");
//		
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
	
	// insert Book information
	
	
	public String insertBook(Book book)
	{
	
		try
		{
			PreparedStatement ps = conn.prepareStatement("insert into book values (?,?,?,?,?,?,?)");
		
			ps.setInt(1, book.getId());
			ps.setString(2, book.getName());
			ps.setInt(3, book.getPrice());
			ps.setString(4, book.getAuther());
			ps.setInt(5, book.getQty());
			ps.setString(6, book.getMfgdate());
			ps.setString(7, book.getExpand());
			
			ps.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "Book inserted successfully.";
		
	}
	
	
	// Update Book into database
	
	
	
}
