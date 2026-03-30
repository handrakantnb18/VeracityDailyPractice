package com.main;

import java.util.ArrayList;

import com.controller.UserController;
import com.exception.SomethingWentWrongException;
import com.user.User;

public class UserMain {

	// 1. User -- username, password, email, gender, dob, mobileNo, address, age
		// insert, update, delete, get, getall
		
	public static void main(String[] args) {
		
		UserController controller = new UserController();
		
		// insert user data
		
//		try
//		{
//			User u1 = new User(1, "Vishal", "1818", "vishal@gmail.com", "Male", "18/03/2001", "9876543210", "Pune", 25);
//			User u2 = new User(2, "Rama", "1234", "rama@gmail.com", "Male", "11/10/2005", "9876524123", "Mumbai", 21);
//			User u3 = new User(3, "Priyanka", "1313", "priyanka@gmail.com", "Female", "13/09/1997", "987321654", "Pune", 28);
//			User u4 = new User(4, "Seema", "1717", "seema@gmail.com", "Female", "17/01/1999", "9874562325", "Mumbai", 27);
//			User u5 = new User(5, "Chandrakant", "1813", "chandrakant@gmail.com", "Male", "18/02/2001", "963527412", "banglore", 26);
//			User u6 = new User(6, "Cherry", "2523", "cherry@gmail.com", "Female", "01/11/1999", "9874562325", "Mumbai", 28);
//			User u7 = new User(7, "Vittal", "8877", "vittal@gmail.com", "Male", "01/05/2005", "963527412", "banglore", 21);
//			
//			
//			String msg1 = controller.insertUser(u1);
//			String msg2 = controller.insertUser(u2);
//			String msg3 = controller.insertUser(u3);
//			String msg4 = controller.insertUser(u4);
//			String msg5 = controller.insertUser(u5);
//			String msg6 = controller.insertUser(u6);
//			String msg7 = controller.insertUser(u7);
//			
//			System.out.println(msg1);
//			System.out.println(msg2);
//			System.out.println(msg3);
//			System.out.println(msg4);
//			System.out.println(msg5);
//			System.out.println(msg6);
//			System.out.println(msg7);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
		// update user
		
//		try
//		{
//		User u8 = new User(2, "Datta", "1589", "datta@gmail.com", "Male", "02/02/2002", "9512364790", "Chennai", 25);
//		
//		String msg = controller.update(u8);
//		
//		System.out.println(msg);
//		}
//		catch(SomethingWentWrongException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		
		// Delete user into table
		
//		try
//		{
//		System.out.println(controller.delete(4));
//		
//		}
//		catch(SomethingWentWrongException e)
//		{
//			e.printStackTrace();
//		}
		
	
		
		// get one user from table
		
//		try
//		{
//		User user = controller.get(4);
//		
//		System.out.println(user);
//		
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//		
//		
		// get all user from table
		
		
		try
		{
			ArrayList<User> all = controller.getAll();
		
			for(User usr : all)
			{
				System.out.println("");
				System.out.println("ID       : "+usr.getId());
				System.out.println("UserName : "+usr.getUsername());
				System.out.println("Password : "+usr.getPassword());
				System.out.println("Email    : "+usr.getEmail());
				System.out.println("Gender   : "+usr.getGender());
				System.out.println("DOB      : "+usr.getDob());
				System.out.println("MobileNo : "+usr.getMobileNo());
				System.out.println("Address  : "+usr.getAddress());
				System.out.println("Age      : "+usr.getAge());
				
				System.out.println("--------------------------------------");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
