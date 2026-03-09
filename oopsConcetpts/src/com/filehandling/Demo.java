package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	
	public static void main(String[] args) {
		File file = new File("D:\\Veracity\\File Handling\\student.txt");
		
		try
		{
		file.createNewFile(); // create new file // compile time Exception
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
