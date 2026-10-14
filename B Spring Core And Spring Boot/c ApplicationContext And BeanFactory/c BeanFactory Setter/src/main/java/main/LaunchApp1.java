package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import services.Test1;

public class LaunchApp1 
{
	public static void main(String [] args)
	{
		// Bean Factory
		// ApplicationContext
		
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		
		reader.loadBeanDefinitions("applicationContext.xml");
		
		Test1 t = beanFactory.getBean(Test1.class);
		
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

Test1 Bean Created...
JavaCourse Bean Created ...

Setter Injection

Java course is purchased and the fees paid is : 2500.0
Course Purchased Successfully ...

*/;