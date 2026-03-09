package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	
	public static void main(String[] args) {
		File file = new File("D:\\Veracity\\File Handling\\abc.txt");
		
		try
		{
			if(file.createNewFile())
			{
				System.out.println("File created");
				// create new file // compile time Exception
			}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("File already exists");
	}
}
