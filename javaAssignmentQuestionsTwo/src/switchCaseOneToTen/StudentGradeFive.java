package switchCaseOneToTen;

import java.util.Scanner;

public class StudentGradeFive {

	public static void main(String[] args) {
		
		// Display student grade (A, B, C, D, Fail) using switch case
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks : ");
		int marks = sc.nextInt();
		
		String grade;
		
		switch(marks / 10)
		{
		case 10:
			
		case 9:
			grade = "A";
			break;
			
		case 8:
			grade = "B";
			break;
			
		case 7:
			grade = "C";
			break;
			
		case 6:
			grade = "D";
			break;
			
			default :
				if(marks >= 0 && marks < 60)
				{
					grade = "Fail";
				}
				else
				{
					grade = "Invalid Marks!";
				}
				
		}
		System.out.println("Grade : "+grade);
	}
}
