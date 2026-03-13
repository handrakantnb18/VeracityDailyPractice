package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class DemoTwo {

	public static void main(String[] args) {


		try
		{
			
			FileWriter fw = new FileWriter("D:\\Veracity\\File Handling\\student.txt", true);
			fw.write("\ni am from sangli");
			fw.flush();
			System.out.println("Data addedd in file.");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}
}
