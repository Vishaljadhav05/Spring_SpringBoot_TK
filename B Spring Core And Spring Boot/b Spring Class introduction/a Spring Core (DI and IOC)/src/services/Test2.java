package services;

// Target Class

public class Test2 // extends JavaCourse
{
	private ICourse course; 
	
	public Test2()
	{
		
	}
	
	// Constructor Injection
	public Test2(ICourse course)
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
