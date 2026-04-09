package com.main;

import com.controller.UserController;
import com.entity.User;

public class UserMain {

	public static void main(String[] args) {
		
		UserController controller = new UserController();
		
		 User user = controller.getUser(2);
		 
		 System.out.println(user);
		
//		User user = new User(1,"priyanka","1818","Pune");
		
//		User user = new User(2, "ram", "1810", "Pune");
//		
//		String msg = controller.save(user);
//		
//		System.out.println(msg);
		
	}
}
