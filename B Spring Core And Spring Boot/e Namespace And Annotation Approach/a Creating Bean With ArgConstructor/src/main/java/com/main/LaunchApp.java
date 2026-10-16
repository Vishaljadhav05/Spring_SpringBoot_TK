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
		
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		emp1.empTask();
		
		System.out.println("------------------------------------------");
		
		Employee emp2 = context.getBean("emp2",Employee.class);
		System.out.println(emp2);
		emp2.empTask();
		
		System.out.println("------------------------------------------");
		
		Employee emp3 = context.getBean("emp3",Employee.class);
		System.out.println(emp3);
		emp3.empTask();
		
	}
}


//Output:-

/*

Employee Bean Created ...
Employee Bean Created ...
Employee Bean Created ...
Employee [Id : 1, Name : Vishal, Salary : 1200000.25, City : Indore]
Employee pretend that he is busy but in reality, Not productive 
------------------------------------------
Employee [Id : 2, Name : Komal, Salary : 1500000.25, City : Ujjain]
Employee pretend that he is busy but in reality, Not productive 
------------------------------------------
Employee [Id : 3, Name : Prafull, Salary : 2000000.25, City : Bangluru]
Employee pretend that he is busy but in reality, Not productive 


*/;