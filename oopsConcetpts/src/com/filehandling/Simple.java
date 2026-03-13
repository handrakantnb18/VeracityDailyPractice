package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Simple {

	
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(103);
		s.setName("vijay");
		s.setAddress("sangli");
		
		try
		{
			FileWriter fw = new FileWriter("D:\\Veracity\\File Handling\\abc.txt", true);
			
			fw.write("\n=====================");
			fw.write("\nId      : "+s.getId());
			fw.write("\nName    : "+s.getName());
			fw.write("\nAddress : "+s.getAddress());
			
			fw.flush();
			System.out.println("Data Added.");
		}
		catch(Exception oe)
		{
			System.out.println(oe.getMessage());
		}
	}
}
