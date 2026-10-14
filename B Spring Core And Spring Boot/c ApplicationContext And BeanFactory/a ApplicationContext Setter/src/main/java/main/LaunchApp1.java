package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import services.Test1;

public class LaunchApp1 
{
	@SuppressWarnings("resource")
	public static void main(String [] args)
	{
		// Bean Factory
		// ApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Test1 t = context.getBean(Test1.class);
		
		Boolean status = t.buyTheCourse(2500.0);
		if(status)
		{
			System.out.println("Course Purchased Successfully ...");
		}
		else
		{
			System.out.println("Failed to purchase the course !!!");
		}
	}
}


//Output:-

/*

SpringBootCourse Bean Created ...
JavaCourse Bean Created ...
Test1 Bean Created...

Setter Injection

Java course is purchased and the fees paid is : 2500.0
Course Purchased Successfully ...

*/;