package relationalOperators;

import java.util.Iterator;

public class Demo4 {
	public static void main(String[] args) {
		// userName, password, = login success

		// skills java, python, age = 10 = JOB

		String userName = "chandraaknt";

		String password = "12345";

		System.out.println(userName == userName);
		System.out.println(password == password);
		
		String skills = "java";
		int age = 10;
		String job;
		
		System.out.println(skills == skills);
		System.out.println(age == age);
		System.out.println(skills != skills);
	}

}
