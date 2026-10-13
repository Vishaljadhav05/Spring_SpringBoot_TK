package main;


// import services.JavaCourse;
import services.SpringBootCourse;
import services.Test1;

public class LaunchApp1 
{
	public static void main(String [] args)
	{
		Test1 t = new Test1(); // Target Class
		
		/* ------ Setter Injection ------- */
		// t.setCourse(new JavaCourse());
		t.setCourse(new SpringBootCourse()); // Dependency Injection
		
		Boolean status = t.buyTheCourse(4545.5);
		if(status)
			System.out.println("Course Enrolled Successfully");
		else
			System.out.println("Failed Tp Enroll For The Course !!!");
	}
}


//Output:-

/*

SpringBoot course is purchased and the fees paid is : 4545.5
Course Enrolled Successfully

*/
