package DoWhileLoopThirtyOneToFourty;

import java.util.Scanner;

public class MenuUserChoice {

	public static void main(String[] args) {
		
		// 38. Display menu until user chooses exit using do-while loop.

		Scanner sc = new Scanner(System.in);
		
		
		int choice;
		
		int id = 0;
		String name = " ";
		String address = " ";
		String contact = " ";
		
		
		do
		{
			System.out.println("1. Enter user Id :");
			System.out.println("2. Enter user name : ");
			System.out.println("3. Enter user Address : ");
			System.out.println("4. Enter user Contact : ");
			System.out.println("5. Exit ");
			System.out.println("Enter number : ");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			
			case 1:
				System.out.println("Enter User Id : ");
				id = sc.nextInt();
				break;
				
			case 2:
				System.out.println("Enter Name : ");
				name = sc.nextLine();
				break;
				
			case 3:
				System.out.println("Enter Address : ");
				address = sc.nextLine();
				break;
				
			case 4:
				System.out.println("Enter Contact : ");
				contact = sc.nextLine();
				break;
				
			case 5:
				System.out.println("===== User Details =====");
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Address : "+address);
				System.out.println("Contact : "+contact);
				break;
				
			case 6:
				System.out.println("Exit.");
				break;
				
			default :
				System.out.println("Invalid Choice. ");
			}
			
		}while(choice != 6);
		
	}
}
