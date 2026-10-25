package com.vj.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vj.models.Employee;

@Repository("dao")
public class EmployeeDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// private String sql = "INSERT INTO employee(id,name,city) VALUES (101,'amit','ujjain');";
	private String sql = "INSERT INTO employee(id,name,city) VALUES (?,?,?);";
	
//	public void input()
//	{
//		jdbcTemplate.update(sql);
//		System.out.println("Data Inserted Successfully.");
//	}
	
	
	public void input(Employee emp)
	{
		jdbcTemplate.update(sql,emp.getId(),emp.getName(),emp.getCity());
		System.out.println("Data Inserted Successfully.");
	}
}
