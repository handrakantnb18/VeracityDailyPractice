package assignments;

import java.util.Scanner;

public class UserOne {
	
	public static void main(String[] args) {
		// User - id, name, city, contact, email;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User id : ");
		int id = sc.nextInt();
		
		System.out.println("User name : ");
		String name = sc.next();
		
		System.out.println("User City : ");
		String city = sc.next();
		
		System.out.println("Contact : ");
		String contact = sc.next();
		
		System.out.println("Email : ");
		String email = sc.next();
		
		System.out.println("User id : "+id+" User Name : "+name+" City : "+city+" Contact : "+contact+" Email : "+email);
		
		
	}

}
