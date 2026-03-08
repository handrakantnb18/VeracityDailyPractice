package com.exception;

public class TestUser {

	void user(String username) throws UserNotValidException
	{
		
		if(!username.equals("chandra"))
		{
			throw new UserNotValidException("User is not valid.");
		}
		System.out.println("User Valid Login Successful.");
	}
	
	public static void main(String[] args) {
		TestUser tu = new TestUser();
		
		try
		{
			tu.user("gest");
		}
		catch(UserNotValidException ua)
		{
			System.out.println(ua.getMessage());
		}
	}
}
