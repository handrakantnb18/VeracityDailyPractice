package loopingStatements;

import java.util.Scanner;

public class StudentMgmtSystem {

	public static void main(String[] args) {

		// Student management system
		// 1. Add Student = id, name, marks - -45, 245, address - 20, age > 10,
		// CollegeName 1. student only - > // validate =
		// 2. Appy the Grade > 90 - A, 80 > B
		// 3. Display Student Data - sysout (id, name
		// 4. Exit

		// validate

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student management system : ");
		
		int choice;
		int id = 0;
		int age = 0;
		String name = " ", address = " ", collageNmae = " ";
		double marks = 0;
		char grade = ' ';
		
		do {
			
			System.out.println("1. Add Student");
			System.out.println("2. Apply Grade");
			System.out.println("3. Display Student Data");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("Enter student id : ");
				id = sc.nextInt();
				
				System.out.println("Enter Student Name : ");
				name = sc.next();
				
				System.out.println("Enter Address : ");
				address = sc.next();
				
				System.out.println("Enter Collage Name : ");
				collageNmae = sc.next();
				
				System.out.println("Enter age Greater than 10 : ");
				age = sc.nextInt();
				
				System.out.println("Enter marks 0 to 100 : ");
				marks = sc.nextDouble();
				
				if(age <= 0 || marks < 0 || marks > 100)
				{
					System.out.println("Invalid.. Student not found");
				}
				else
				{
					System.out.println("Student addded successfully.");
					break;
				}
				
			}
			
			else if(choice == 2)
			{
				if(marks >= 90)
				{
					grade = 'A';
				}
				else if (marks >= 80)
				{
					grade = 'B';
				}
				else if (marks >= 50)
				{
					grade = 'C';
				}
				else
				{
					grade = 'D';
				}
			}
			
			else if (choice == 3)
			{
				System.out.println("========== Display Student Details ==========");
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Age : "+age);
				System.out.println("Addrerss : "+address);
				System.out.println("College : "+collageNmae);
				System.out.println("Marks : "+marks);
				System.out.println("Grade : "+grade);
				
				break;
				
			}
			else if (choice == 4)
			{
				System.out.println("Exit.");
			}
			else
			{
				System.out.println("Invalid choice.. select 1 to 4");
			}
			
		}while(true);
		
	}
}
