package com.filehandling;

import java.io.File;
import java.io.FileWriter;
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
			
			File f = new File("D:\\Veracity\\File Handling\\user.txt");
			
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
	
	// file delete
	
	void writeDataIntoFile()
	{
		try
		{
			System.out.println("Enter file name : ");
			String fileName = sc.nextLine();
			
			FileWriter fw = new FileWriter("D:\\Veracity\\File Handling\\user.txt", true);
			
			System.out.println("Enter data to write : ");
			String data = sc.nextLine();
			
			fw.write(data+"\n ");
			fw.close();
			
			System.out.println("Data written successfully");
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// file read
	
	void readDataFromFile()
	{
		try
		{
			System.out.println("Enter file name : ");
			String fileName = sc.nextLine();
			
			File file = new File(fileName);
			Scanner sc = new Scanner(file);
			
			System.out.println("\nFile Contents..");
			
			while (sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			
			sc.close();
		}
		catch(IOException e)
		{
			System.out.println("Error reading file.");
		}
	}
	
	
	// delete file
	
	void deleteFile()
	{
		System.out.println("Enter file name : ");
		String fileName = sc.nextLine();
		
		File file = new File(fileName);
		
		if(file.delete())
		{
			System.out.println("File deleted successfully.....");
		}
		else
		{
			System.out.println("File not fount.");
		}
	}
	
	public static void main(String[] args) {
		CRUD crud = new CRUD();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.create file ");
			System.out.println("2. WriteFile ");
			System.out.println("3.ReadFileFromFile ");
			System.out.println("4.DeleteFile");
			System.out.println();
			
		}
	}
	
}
