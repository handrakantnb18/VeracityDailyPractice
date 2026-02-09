package assignments;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Employee = id, name, address, dept, gender
		
		int id = sc.nextInt();
		String name = sc.next();
		String address = sc.next();
		String dept = sc.next();
		String gender = sc.next();
		
		
		System.out.println("Enter Id : "+id);
		
		System.out.println("Enter name : "+name);
		
		System.out.println("Enter Adderss : "+address);
		
		System.out.println("Enter Dept : "+dept);
		
		System.out.println("Enter Gender : "+gender);
		
		
		String result = sc.nextLine();
		
		System.out.println("ID : "+id+"Name : "+name+"Address : "+address+" Dept : "+dept+"Gender : "+gender);
		
		
	}

}
