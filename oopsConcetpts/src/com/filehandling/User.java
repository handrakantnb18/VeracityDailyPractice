package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class User {

	
	public static void main(String[] args) {
		
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("D:\\Veracity\\File Handling\\text.txt", true);
			
			for(int i = 1; i <= 100; i++)
			{
				// fw.write("\nMy name is chandrakant bhosale");
				// fw.write("\nIntegers : "+i);
				// fw.write(Integer.toString(i)+ " | ");
				fw.write("\nValues : "+i);
			}
		}
		catch(IOException eio)
		{
			eio.printStackTrace();
		}
		finally {// finally is block which is used to close the resources ex. filewriter, DB connection
			
			try
			{
			fw.close();  // for the security to close the filewriter
			
			}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		}
	}
}
