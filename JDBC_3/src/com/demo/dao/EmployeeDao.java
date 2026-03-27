package com.demo.dao;

import java.sql.Connection;
import java.sql.Statement;

// import com.demo.employees.Employee;
import com.demo.jdbcConnection.JDBCUtil;
import com.entity.*;

public class EmployeeDao {

	// database code
	
	Connection conn = JDBCUtil.createConnection();
	
	// createTable
	
//	public void createTable()
//	{
		
//		try
//		{
//			
//			Statement stmt = conn.createStatement();
//			
//			stmt.execute("create table employees (id int, name varchar(34), salary double, dept varchar(34), gender varchar(34), city varchar(34))");
//			
//			System.out.println("table created");
//		
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
	
		public void insertEmployee(Employee employee)
		{
			try
			{
			 Statement stmt = conn.createStatement();
			
//			stmt.execute("insert into employees values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getGender()+"','"+employee.getCity()+"','"+employee.getSalary()+"','"+employee.getDept()+"')");
			
			 stmt.execute("insert into employees values("+employee.getId()+",'"+employee.getName()+"',"+employee.getSalary()+",'"+employee.getDept()+"','"+employee.getGender()+"','"+employee.getCity()+"')");
			 
			System.out.println("Inserted table");
			
			
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		Employee e1 = new Employee(22, "ram", "Male", "pune", 25252, "IT");
		
		dao.insertEmployee(e1);
		
//		System.out.println(e1);
//		e1.setId(25);
//		e1.setName("Chandrakant");
//		e1.setGender("Male");
//		
//		e1.setCity("Pune");
////		e1.setSalary(252525.55);
//		e1.setDept("IT");
//		
//		dao.insertEmployee(e1);
//		//System.out.println(e1);
//		dao.createTable(); 
		
	}
	
}
