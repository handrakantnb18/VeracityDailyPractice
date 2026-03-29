package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.user.User;
import com.util.JDBCUtil;

public class UserDao {

//	public static void main(String[] args) {
//		UserDao dao = new UserDao();
//		
//		dao.createTable();
//	}
	
	Connection conn = JDBCUtil.createConnection();
	
	
//	public  void createTable()
//	{
//		try
//		{
//			Statement stmt = conn.createStatement();
//			
//			stmt.execute("create table user (id int, username varchar(34), password varchar(20), email varchar(34), gender varchar(20), dob varchar(20), mobileNo varchar(20), address varchar(34), age int )");
//			
//			System.out.println("Table created.");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//	}
	
	// insert user
	
	public String insertUser(User user)
	{
		try
		{
			PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?)");
		
			ps.setInt(1, user.getId());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getDob());
			ps.setString(7, user.getMobileNo());
			ps.setString(8, user.getAddress());
			ps.setInt(9, user.getAge());
			
			ps.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "User inserted successfuly";
	}
	
	// UpdateUser data
	
	public String updateUser(User user)
	{
		try
		{
			PreparedStatement ps= conn.prepareStatement("update user set username=?,password=?,email=?,gender=?,dob=?,mobileNo=?,address=?,age=? where id=?");
		
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getGender());
			ps.setString(5, user.getDob());
			ps.setString(6, user.getMobileNo());
			ps.setString(7, user.getAddress());
			ps.setInt(8, user.getAge());
			ps.setInt(9, user.getId());
			
			int num= ps.executeUpdate();
			
			if(num>0)
			{
				return "User Update Successfully";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}
		// delete user from table
		
		public String delete(int id)
		{
			try
			{
				PreparedStatement ps = conn.prepareStatement("delete from user where id=?");
			
				ps.setInt(1, id);
				
				int value = ps.executeUpdate();
				
				if(value>0)
				{
					return "User deleted Successfully.";
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}
		
		
		// get single user into table
		
		
	
}
