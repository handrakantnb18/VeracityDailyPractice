package com.main;

import java.util.List;

import com.controller.UserController;
import com.entity.User;
import com.exception.UserNotFoundException;

public class UserMain {

	public static void main(String[] args) {
		
		UserController controller = new UserController();
		
		List<User> users = controller.getAll();
		
		for(User user : users)
		{
			System.out.println(users);
		}
		
		
//		try
//		{
//		 User user = controller.getUser(1);
//		 
//		 System.out.println(user);
//		}
//		catch(UserNotFoundException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
//		User user = new User(1,"priyanka","1818","Pune");
		
//		User user = new User(2, "ram", "1810", "Pune");
//		
//		String msg = controller.save(user);
//		
//		System.out.println(msg);
		
	}
}
