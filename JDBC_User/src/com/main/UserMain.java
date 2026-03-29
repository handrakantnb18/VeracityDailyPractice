package com.main;

import com.controller.UserController;
import com.user.User;

public class UserMain {

	// 1. User -- username, password, email, gender, dob, mobileNo, address, age
		// insert, update, delete, get, getall
		
	public static void main(String[] args) {
		
		UserController controller = new UserController();
		
		try
		{
			User u1 = new User(1, "Vishal", "1818", "vishal@gmail.com", "Male", "18/03/2001", "9876543210", "Pune", 25);
			User u2 = new User(2, "Rama", "1234", "rama@gmail.com", "Male", "11/10/2005", "9876524123", "Mumbai", 21);
			User u3 = new User(3, "Priyanka", "1313", "priyanka@gmail.com", "Female", "13/09/1997", "987321654", "Pune", 28);
			User u4 = new User(4, "Seema", "1717", "seema@gmail.com", "Female", "17/01/1999", "9874562325", "Mumbai", 27);
			User u5 = new User(5, "Chandrakant", "1813", "chandrakant@gmail.com", "Male", "18/02/2001", "963527412", "banglore", 26);
			
			
			String msg1 = controller.insertUser(u1);
			String msg2 = controller.insertUser(u2);
			String msg3 = controller.insertUser(u3);
			String msg4 = controller.insertUser(u4);
			String msg5 = controller.insertUser(u5);
			
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
	}
}
