package assignments;

import java.util.Scanner;

public class EmployeeThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Employee = id, name, address, dept, gender

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

		System.out.println("Id is : " + id);

		System.out.println("Name is : " + name);

		System.out.println("Address is : " + address);

		System.out.println("Department is : " + dept);

		System.out.println("Gender is : " + gender);

		System.out.println("id : " + id + " name : " + name + " address : " + address + " dept : " + dept + " gender : " + gender);

	}

}
