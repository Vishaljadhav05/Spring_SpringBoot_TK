package com.test.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary  // Qualifier has more than primary
public class JavaCourse implements ICourse
{

	public JavaCourse()
	{
		System.out.println("JavaCourse Bean Created ...");
	}
	
	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Java course is purchased and the fees paid is : "+ amount);
		return true;
	}

}
