package com.constructortype;


 // Constructor Overloading

class StudentMainDo
{
	StudentMainDo(String name)
	{
		System.out.println("Constructor with one : "+ "argument - String : "+name);
	}
	
	StudentMainDo(String name, int age)
	{
		System.out.println("Constructor with two arguments : "+" String and integer : "+name + " "+age);
	}
	
	StudentMainDo(long id)
	{
		System.out.println("Constructor with one arguments : "+" Long : "+id);
	}
}


public class MainStudent {

	public static void main(String[] args) {
		
		StudentMainDo s1 = new StudentMainDo("Chandrakant");
		
		StudentMainDo s2 = new StudentMainDo("Priyanka", 25);
		
		StudentMainDo s3 = new StudentMainDo(56464464);
		
	}
}
