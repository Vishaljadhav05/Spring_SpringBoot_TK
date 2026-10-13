package services;

// Target Class

public class Test1 // extends JavaCourse
{
	private ICourse course; 

	public void setCourse(ICourse course) // ICourse course = new JavaCourse() or new SpringBootCourse()
	{
		this.course = course;
	}


	public Boolean buyTheCourse(Double amount)
	{
		// The below approach is bad in terms of the loose coupling.It makes our class Tightly coupled.
		/*
		JavaCourse j = new JavaCourse();
		return j.getTheCourse(amount);
		*/
		
		
		// The below inheritance approach is also bad in terms of the loose coupling.It makes our class Tightly coupled.
		/*
		return getTheCourse(amount); 
		*/
		
		
		// ---------------------  We use dependency injection to achieve this.--------------
		
		return course.getTheCourse(amount);
	}
}
