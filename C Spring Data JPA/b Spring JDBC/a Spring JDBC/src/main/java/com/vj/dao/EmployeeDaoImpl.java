package com.vj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.vj.models.Employee;

@Repository("emp_details")
public class EmployeeDaoImpl implements EmployeeDao
{
	private String SQL_QUERY = "SELECT * FROM employee";
	
	@Autowired
	private DataSource dataSource;
	
	List<Employee> employees = null;
	
	@Override
	public List<Employee> getEmployeeInfo() 
	{
		try 
		{
			// Register the driver
			
			// Getting Connection
			Connection con = dataSource.getConnection();
			
			PreparedStatement ps = con.prepareStatement(SQL_QUERY);
			
			ResultSet rs = ps.executeQuery();
			
			employees = new ArrayList<Employee>();
			
			while(rs.next())
			{
				Employee emp = new Employee();
				
				/*
				Integer i = rs.getInt(1);
				emp.setId(i);
				
				String name = rs.getString(2);
				emp.setName(name);
				
				String city = rs.getString(3);
				emp.setName(city);
				*/
				
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setCity(rs.getString(3));
				
				employees.add(emp);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return employees;
	}

}
