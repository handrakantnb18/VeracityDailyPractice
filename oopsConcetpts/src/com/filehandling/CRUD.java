package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CRUD {

	Scanner sc = new Scanner(System.in);
	
	// file create
	void createFile()
	{
		try
		{
			System.out.println("Enter file name : ");
			String fileName = sc.nextLine();
			
			File f = new File("");
			
			if (f.createNewFile())
			{
				System.out.println("File created.");
			}
			else
			{
				System.out.println("File allready exits.");
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	void writeDataIntoFile()
	{
		
	}
	
	void readDataFromFile()
	{
		
	}
	
	void deleteFile()
	{
		
	}
	
	public static void main(String[] args) {
		
		while(true)
		{
			System.out.println("1.create file ");
			System.out.println("2. WriteFile ");
			System.out.println("3.ReadFileFromFile ");
			System.out.println("4.DeleteFile");
			
		}
	}
	
}
