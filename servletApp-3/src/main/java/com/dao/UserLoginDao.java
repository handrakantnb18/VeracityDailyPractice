package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.UserLogin;
import com.utility.JDBCConnection;

public class UserLoginDao {

	Connection conn = JDBCConnection.getConnection();
	
	public String saveUserLogin(UserLogin userLogin)
	{
		try
		{
			PreparedStatement pst = conn.prepareStatement("insert into userlogin values(?,?)");
		
			pst.setString(1, userLogin.getName());
			pst.setString(2, userLogin.getPassword());
			
			pst.executeUpdate();
					
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "User Login Successfully";
	}
}
