package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Developer
{
	public Developer()
	{
		System.out.println("Developer bean created...");
	}
	
	public void devTask()
	{
		System.out.println(">>> Devleoped a Beautiful application <<<");
	}
}
