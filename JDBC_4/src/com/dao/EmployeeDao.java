package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

// import com.demo.jdbcConnection.JDBCUtil;
import com.entity.Employee;

public class EmployeeDao {
	
//	public static void main(String[] args) {
////		EmployeeDao dao = new EmployeeDao();
////		
////		dao.createTable(); 
//	}

	 Connection conn = com.util.JDBCUtil.createConnection();

	//Connection conn = com.util.JDBCUtil.createConnection();
	
	//Connection conn;

//	public static  void createTable()
//	{
//		//Connection conn;
//		try
//		{
//			Statement stmt = conn.createStatement();
//
//			
//			String sql = "CREATE TABLE employees ("
//                    + "id INT PRIMARY KEY, "
//                    + "name VARCHAR(34), "
//                    + "gender VARCHAR(34), "
//                    + "city VARCHAR(34), "
//                    + "salary DOUBLE, "
//                    + "dept VARCHAR(34))";
//			
//			stmt.execute(sql);
//			
//			//stmt.execute("create table employees (id int, name varchar(34),  gender varchar(34), city varchar(34), salary double, dept varchar(34) )");
//			
//			System.out.println("Table created");
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//
	
	 // insert
	 
	public String insertEmployee(Employee employee) {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into employees values(?,?,?,?,?,?)");

			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());
			ps.setString(4, employee.getGender());
			ps.setString(5, employee.getCity());
			ps.setString(6, employee.getDept());

			ps.execute();
			//System.out.println("Success");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Employee inserted successfully";
	}

	
	// update
	
	public String updateEmployee(Employee employee) {
		try {
			PreparedStatement ps = conn
					.prepareStatement("update employees set name=?,gender=?,salary=?,city=?,dept=? where id=?");

			ps.setString(1, employee.getName());
			ps.setString(2, employee.getGender());
			ps.setDouble(3, employee.getSalary());
			ps.setString(4, employee.getCity());
			ps.setString(5, employee.getDept());
			ps.setInt(6, employee.getId());
//			ps.setString(6, employee.getName());

			int value = ps.executeUpdate(); // insert update and delete value
//			ps.execute();
			
//			int value = ps.execute();
			
			
			if(value > 0)
			{
				return "Employee update successfully";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	// delete 
	
	
	public String delete(int id)
	{
		try
		{
			PreparedStatement ps = conn.prepareStatement("delete from employees where id=?");
			
			ps.setInt(1, id);
			
			int value = ps.executeUpdate();
			
			if(value>0)
			{
				return "Employee deleted Successfully";
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	// get single employee
	
	public Employee getEmployeeById(int id)
	{
		Employee employee = null;
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("select * from employees where id=?");
		
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			String dept = rs.getString("dept");
			String city = rs.getString("city");
			double salary = rs.getDouble("salary");
			
			employee= new Employee(id1, name, gender, city, salary, dept);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return employee;
	}
	
	public ArrayList<Employee> getAllEmployees()
	{
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee employee = null;
		
		try
		{
			PreparedStatement ps = conn.prepareStatement("select * from employees");
		
			// ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			String dept = rs.getString("dept");
			String city = rs.getString("city");
			double salary = rs.getDouble("salary");
			
			employee= new Employee(id1, name, gender, city, salary, dept);
			
			employees.add(employee);
			
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return employees;
	}

}
