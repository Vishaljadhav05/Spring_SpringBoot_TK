package com.vj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.dao.EmployeeDao;
import com.vj.models.Employee;

@Component
public class JdbcRunner implements CommandLineRunner
{
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public void run(String... args) throws Exception 
	{
		dao.input(new Employee(102,"Rohit","pune"));
	}

}
