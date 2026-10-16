package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.services.Employee;


public class LaunchApp
{
	@SuppressWarnings("resource")
	public static void main(String [] args)
	{
		// Bean Factory
		// ApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp);
		emp.empTask();
	
		
	}
}


//Output:-

/*

Department Bean Created ...
Employee Bean Created ...
Employee [Id = 1, Name = Vishal, Salary = 2000000.8, City = Indore, Department = Department [Department Id =1 Department Name =Sales]]
Employee pretend that he is busy but in reality, Not productive 



*/;