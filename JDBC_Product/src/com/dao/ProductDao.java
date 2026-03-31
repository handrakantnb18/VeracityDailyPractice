package com.dao;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	public String updateProduct(Product product)
	{
		try
		{
			PreparedStatement ps = conn.prepareStatement("update product set name=?,price=?,category=?,qty=? where id=?");
			
			ps.setString(1, product.getName());
			ps.setInt(2, product.getPrice());
			ps.setString(3, product.getCategory());
			ps.setInt(4, product.getQty());
			ps.setInt(5, product.getId());
			
			int vlaue = ps.executeUpdate();
			if(vlaue>0)
			{
				return "Product update Successfullly";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	// delete single product into table
	
	public String delete(int id)
	{
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("delete from product where id=?");
			
			ps.setInt(1, id);
			
			int value = ps.executeUpdate();
			
			if(value>0)
			{
				return "Product deleted successfully";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	// get single product into table with id
	
	public Product getProductById(int id)
	{
		Product product = null;
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("select * from product where id=?");
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				int qty = rs.getInt("qty");
				
				product = new Product(id1, name, price, category, qty);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return product;
		
	}
	
	// getAll Product from table
	
	public ArrayList<Product> getAllProducts()
	{
		ArrayList<Product> products = new ArrayList<Product>();
		Product product = null;
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("select * from product");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				int qty = rs.getInt("qty");
				
				product = new Product(id1, name, price, category, qty);
				
				products.add(product);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return products;
	}
	
	
}
