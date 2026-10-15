package com.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Test1 
{
	@Autowired // auto wire using field
	@Qualifier("javaCourse")
	private ICourse course; 
	
	public Test1(ICourse course)
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
	

	public void setCourse(ICourse course) // ICourse course = new JavaCourse() or new SpringBootCourse()
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
