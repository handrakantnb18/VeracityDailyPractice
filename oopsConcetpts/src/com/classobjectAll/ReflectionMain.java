package com.classobjectAll;

class Student1
{
	public Student1()
	{
		
	}
}

public class ReflectionMain {

	// Used for dynamic class loading as seen in framework like spring
	
	public static void main(String[] args) {
		try 
		{
			Class<?> c = Class.forName("Student");
            Student1 s = (Student1) c.getDeclaredConstructor().newInstance();
            System.out.println(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
