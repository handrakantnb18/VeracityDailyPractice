package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.User;
import com.utility.JDBCConnection;

public class UserDao {

	Connection conn = JDBCConnection.getConnection();
	
	public String saveUser(User user)
	{
		try
		{
			PreparedStatement pst = conn.prepareStatement("insert into users values(?,?,?,?,?)");
		
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getPassword());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getCity());

			pst.executeUpdate();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "USer Register Successfully";
	}
	
	
}
