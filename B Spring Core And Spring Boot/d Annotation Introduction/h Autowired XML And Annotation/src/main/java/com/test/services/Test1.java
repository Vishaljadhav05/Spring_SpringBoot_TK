package com.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Test1 
{
	private ICourse course; 
	
	
	@Autowired // auto wire using setter
	// @Qualifier("springBootCourse") // Qualifier Annotation cannot be applied with the constructor.
	public Test1( @Qualifier("javaCourse")ICourse course) // But we can use in parameter
	{
		super();
		System.out.println("---------------------");
		System.out.println("Constructor Injection");
		System.out.println("---------------------");
		this.course = course;
	}
	public Test1()
	{
		System.out.println("Test1 Bean Created...");
	}
	

	
	public void setCourse(ICourse course) 
	{
		System.out.println();
		System.out.println("Setter Injection");
		System.out.println();
		this.course = course;
	}


	public Boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
}
