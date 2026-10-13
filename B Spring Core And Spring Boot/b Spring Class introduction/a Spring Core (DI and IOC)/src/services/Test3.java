package services;

// Target Class

public class Test3 // extends JavaCourse
{
	private ICourse course; 
	
	public Test3()
	{
		
	}
	// Constructor Injection
	public Test3(ICourse course)
	{
		this.course = course;
	}

	
	public void setCourse(ICourse course) // ICourse course = new JavaCourse() or new SpringBootCourse()
	{
		this.course = course;
	}



	public Boolean buyTheCourse(Double amount)
	{
		// ---------------------  We use dependency injection to achieve this.--------------
		
		return course.getTheCourse(amount);
	}
}
