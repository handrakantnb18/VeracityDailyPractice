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
			System.out.println((char) i);

			// while loop

			int data;
			while ((data = fr.read()) != -1) 
			{
				System.out.print((char)data);
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
