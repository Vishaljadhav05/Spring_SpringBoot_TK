package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LaunchApp 
{
	@SuppressWarnings("unused")
	public static void main(String [] args)
	{
		// Bean Factory
		// ApplicationContext
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	}
}


//Output:-

/*

Dao bean created...
Config Bean is created...
Service bean created...
Utility bean created...
WebLayer bean created...

*/;