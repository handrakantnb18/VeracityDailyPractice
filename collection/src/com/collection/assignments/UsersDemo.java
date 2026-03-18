package com.collection.assignments;

import java.util.ArrayList;

public class UsersDemo {

	// create ArrayList and add 5 Users      iterate 4 ways

	public static void main(String[] args) {
		
		ArrayList<Users> users = new ArrayList<Users>();
		users.add(new Users(1, "chandrakant", "1818", "India", "987654321", "Pune"));
		users.add(new Users(2, "priyanka", "1313", "India", "987654320", "Sangli"));
		users.add(new Users(3, "smith", "1820", "USA", "9875554321", "Californiya"));
		users.add(new Users(4, "vijay", "3131", "India", "9876543434", "Mumbai"));
		users.add(new Users(5, "adam", "252518", "UK", "987654000", "London"));
		users.add(new Users(6, "Brook", "101025", "UK", "9876050500", "London"));
		users.add(new Users(7, "king", "505645", "west indis", "8978554321", "indis"));
		users.add(new Users(8, "sam karan", "568978", "Ingland", "98525254321", "idan gardan"));
		users.add(new Users(9, "tim kook", "2324578", "ANZ", "98765256121", "wilington"));
		users.add(new Users(10, "Markram", "454545", "South Africa", "987654321", "Durban"));
		
		
		for(Users user1 : users)
		{
			System.out.println("\n============================");
			System.out.println("| User Id       : "+user1.getuId());
			System.out.println("| User Name     : "+user1.getUserName());
			System.out.println("| User Password : "+user1.getPassword());
			System.out.println("| Address       : "+user1.getAddress());
			System.out.println("| Mobile number : "+user1.getMobileNo());
			System.out.println("| City          : "+user1.getCity());
		}
	}
}
