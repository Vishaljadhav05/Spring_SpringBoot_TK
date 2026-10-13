package main;


import services.JavaCourse;
import services.SpringBootCourse;
import services.Test3;

public class LaunchApp3 
{
	public static void main(String [] args)
	{
		/* ------ Constructor Injection ------- */
		Test3 t = new Test3(new SpringBootCourse()); // Target Class
		
		
		/* ------ Setter Injection ------- */
		t.setCourse(new JavaCourse());
		
		Boolean status = t.buyTheCourse(4545.5);
		if(status)
			System.out.println("Course Enrolled Successfully");
		else
			System.out.println("Failed Tp Enroll For The Course !!!");
	}
	
}

// We will get java course because the spring boot course passed during the object creation 
// and later it is occupied by the java course

// Output:-

/*
 
Java course is purchased and the fees paid is : 4545.5
Course Enrolled Successfully

*/

