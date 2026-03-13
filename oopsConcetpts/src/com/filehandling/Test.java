package com.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		// read data from file
		
		try
		{
		FileReader fr = new FileReader("D:\\Veracity\\File Handling\\student.txt");
		
		int i = fr.read();
		System.out.println(i);
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
