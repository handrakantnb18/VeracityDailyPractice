package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class DemoTwo {

	public static void main(String[] args) {

		int a = 10, b = 20;
		
		int numbers[] = {34, 23, 56, 89, 25, 58};
		
		String names[] = {"chandraknt", "Priyanka", "Vijay", "Dyana"};
		
		try
		{
			
			FileWriter fw = new FileWriter("D:\\Veracity\\File Handling\\abc.txt", true);
//			fw.write("\ni am from sangli");
			
//			for (int i = 0; i < numbers.length; i++)
//			{
//				fw.write("\nArrays Numbers : "+numbers[i]);
//			}
			
			for (int i = 0; i < names.length; i++)
			{
				fw.write("\nArrays Numbers : "+names[i]);
			}
			
			fw.flush();
			System.out.println("Data addedd in file.");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}
}
