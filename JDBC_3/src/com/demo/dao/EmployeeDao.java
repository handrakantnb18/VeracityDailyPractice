package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	// not recommended this types - statements
//		public void insertEmployee(Employee employee)
//		{
//			try
//			{
//			 Statement stmt = conn.createStatement();
//			
////			stmt.execute("insert into employees values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getGender()+"','"+employee.getCity()+"','"+employee.getSalary()+"','"+employee.getDept()+"')");
//			
//			 stmt.execute("insert into employees values("+employee.getId()+",'"+employee.getName()+"',"+employee.getSalary()+",'"+employee.getDept()+"','"+employee.getGender()+"','"+employee.getCity()+"')");
//			 
//			System.out.println("Inserted table");
//			
//			
//			
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//		
//		
		
	
	public void insertEmployee(Employee employee)
	{
		try
		{
//		 Statement stmt = conn.createStatement();
		
//		stmt.execute("insert into employees values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getGender()+"','"+employee.getCity()+"','"+employee.getSalary()+"','"+employee.getDept()+"')");
		
//		 stmt.execute("insert into employees values("+employee.getId()+",'"+employee.getName()+"',"+employee.getSalary()+",'"+employee.getDept()+"','"+employee.getGender()+"','"+employee.getCity()+"')");
		 
			// this is recommended
			PreparedStatement ps= conn.prepareStatement(
					"insert into employees values(?,?,?,?,?,?)");
			
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());
			ps.setString(4, employee.getDept());
			ps.setString(5, employee.getGender());
			ps.setString(6, employee.getCity());
			
			ps.execute();
			
		System.out.println("Inserted table");
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		Employee e7 = new Employee(8, "rahul", "Male", "Sangli", 10000, "electric");
		Employee e8 = new Employee(9, "rahul", "Male", "Sangli", 10000, "electric");
		Employee e9 = new Employee(10, "rahul", "Male", "Sangli", 10000, "electric");
		Employee e10 = new Employee(11, "rahul", "Male", "Sangli", 10000, "electric");
		Employee e11 = new Employee(12, "rahul", "Male", "Sangli", 10000, "electric");
		Employee e12 = new Employee(13, "rahul", "Male", "Sangli", 10000, "electric");
		
		dao.insertEmployee(e7);
		dao.insertEmployee(e8);
		dao.insertEmployee(e9);
		dao.insertEmployee(e10);
		dao.insertEmployee(e11);
		dao.insertEmployee(e12);
		
//		Employee e1 = new Employee(22, "ram", "Male", "pune", 25252, "IT");
//		Employee e2 = new Employee(3, "vishal", "Male", "chennai", 450000, "HR");
//		Employee e3 = new Employee(4, "vijay", "Male", "dehli", 770000, "sales");
//		Employee e4 = new Employee(5, "pooja", "Female", "kolkatta", 320000, "IT");
//		Employee e5 = new Employee(6, "Asha", "Female", "patana", 350000, "transport");
//		Employee e6 = new Employee(7, "smith", "Male", "banglore", 560000, "medical");
//		
//		dao.insertEmployee(e1);
//		dao.insertEmployee(e2);
//		dao.insertEmployee(e3);
//		dao.insertEmployee(e4);
//		dao.insertEmployee(e5);
//		dao.insertEmployee(e6);
//		
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
