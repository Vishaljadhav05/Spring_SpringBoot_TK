package services;

// Target Class

public class Test1 // extends JavaCourse
{
	
	public Test1()
	{
		System.out.println("Test1 Bean Created...");
	}
	private ICourse course; 

	public void setCourse(ICourse course) // ICourse course = new JavaCourse() or new SpringBootCourse()
	{
		System.out.println();
		System.out.println("Setter Injection");
		System.out.println();
		this.course = course;
	}


	public Boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
}
