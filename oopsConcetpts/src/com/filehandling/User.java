package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class User {

	
	public static void main(String[] args) {
		
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("D:\\Veracity\\File Handling\\abc.txt", true);
		}
		catch(IOException eio)
		{
			eio.printStackTrace();
		}
		finally {// finally is block which is used to close the resources
			
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
