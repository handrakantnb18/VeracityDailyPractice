package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	
	// Update Book into table
	
	public String updateBook(Book book)
	{
		try
		{
			PreparedStatement ps = conn.prepareStatement("update book set "
					+ "name=?,price=?,auther=?,qty=?,mfgdate=?,expand=? where id=?");
			
			ps.setString(1, book.getName());
			ps.setInt(2, book.getPrice());
			ps.setString(3, book.getAuther());
			ps.setInt(4, book.getQty());
			ps.setString(5, book.getMfgdate());
			ps.setString(6, book.getExpand());
			ps.setInt(7, book.getId());
			
			int value = ps.executeUpdate();
			
			if(value>0)
			{
				return "Book update Successfully.";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	// delete single Book id in table
	
	public String delete(int id)
	{
		try
		{
			
			PreparedStatement ps = conn.prepareStatement("delete from book where id=?");
			
			ps.setInt(1, id);
			
			int vlaue = ps.executeUpdate();
			
			if(vlaue>0)
			{
				return "Book deleted Successfully.";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	// get single book into table with id
	
	public Book getBookById(int id)
	{
		
		Book book = null;
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("select * from book where id=?");
					
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String auther = rs.getString("auther");
				int qty = rs.getInt("qty");
				String mfgdate = rs.getString("mfgdate");
				String expand = rs.getString("expand");
				
				book = new Book(id1, name, price, auther, qty, mfgdate, expand);
				
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return book;
	}
	
	// getAll books from tables 
	
	public ArrayList<Book> getAllBooks()
	{
		
		ArrayList<Book> books = new ArrayList<Book>();
		Book book = null;
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("select * from book");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String auther = rs.getString("auther");
				int qty = rs.getInt("qty");
				String mfgdate = rs.getString("mfgdate");
				String expand = rs.getString("expand");
				
				book = new Book(id1, name, price, auther, qty, mfgdate, expand);
				
				books.add(book);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return books;
	}
	
	
}
