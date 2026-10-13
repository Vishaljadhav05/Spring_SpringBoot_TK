package main;


// import services.JavaCourse;
import services.SpringBootCourse;
import services.Test2;

public class LaunchApp2 
{
	public static void main(String [] args)
	{
		/* ------ Constructor Injection ------- */
		Test2 t = new Test2(new SpringBootCourse()); // Target Class
		
		
		Boolean status = t.buyTheCourse(4545.5);
		if(status)
			System.out.println("Course Enrolled Successfully");
		else
			System.out.println("Failed Tp Enroll For The Course !!!");
	}
	
}

// Output:-

/*
 
SpringBoot course is purchased and the fees paid is : 4545.5
Course Enrolled Successfully

*/

