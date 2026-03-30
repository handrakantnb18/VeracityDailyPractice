package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.product.Product;
import com.util.JDBCUtil;

public class ProductDao {

	
//	public static void main(String[] args) {
//		ProductDao dao = new ProductDao();
//		
//		dao.createTable();
//		
//	}
	
	Connection conn = JDBCUtil.createConnection();
	
	// create product table
	
//	public void createTable()
//	{
//		
//		try
//		{
//			Statement stmt = conn.createStatement();
//		
//			stmt.execute("create table product (id int, name varchar(34), price int, category varchar(50), qty int)");
//			
//			System.out.println("Table created.");
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//	}
	
	
	// insert data into table
	
	public String insertProduct(Product product)
	{
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("insert into product values (?,?,?,?,?)");
			
			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setInt(3, product.getPrice());
			ps.setString(4, product.getCategory());
			ps.setInt(5, product.getQty());
			
			ps.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "Product inserted in table";
	}
	
	
	
	// update product into table
	
	
}
