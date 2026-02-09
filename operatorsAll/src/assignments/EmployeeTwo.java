package assignments;

import java.util.Scanner;

public class EmployeeTwo {

	public static void main(String[] args) {
		
		// Employee = id, name, address, dept, gender
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter name : ");
		String name = sc.next();
		
		System.out.println("Enter Address : ");
		String address = sc.next();
		
		System.out.println("Enter Dept : ");
		String dept = sc.next();
		
		System.out.println("Enter gender : ");
		String gender = sc.next();
		
		System.out.println("id : "+id+" Name : "+name+" Address : "+address+" Dept : "+dept+" Gender : "+gender);
		
		
	}
}
