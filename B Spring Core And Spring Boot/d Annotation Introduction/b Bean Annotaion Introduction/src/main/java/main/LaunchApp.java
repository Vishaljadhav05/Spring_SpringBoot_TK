package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.Password;


public class LaunchApp 
{	
	@SuppressWarnings("resource")
	public static void main(String [] args)
	{
		// Bean Factory
		// ApplicationContext
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Password p = context.getBean(Password.class);
		p.passwordAlgoUsed();
	}
}


//Output:-

/*

Dao bean created...
Config Bean is created...
Service bean created...
Utility bean created...
WebLayer bean created...
>>> Password bean created <<<
The algo which is used in algo is : SHA

*/;