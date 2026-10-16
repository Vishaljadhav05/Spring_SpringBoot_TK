package com.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfig;
import com.services.Greetings;

public class LaunchApp1 
{
	@SuppressWarnings("resource")
	public static void main(String [] args)
	{
		// Bean Factory
		// ApplicationContext
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Greetings g = context.getBean(Greetings.class);
		
		System.out.println(g.generateGreeting("Abhay"));
	}
}


//Output:-

/*

SpringConfig Bean Created ...
Greetings Bean Created ...
Good Afternoon! Abhay

*/;