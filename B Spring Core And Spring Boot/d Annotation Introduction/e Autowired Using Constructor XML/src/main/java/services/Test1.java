package services;

// Target Class

public class Test1 // extends JavaCourse
{
	private ICourse course; 
	
	public Test1(ICourse course)
	{
		super();
		System.out.println("---------------------");
		System.out.println("Constructor Injection");
		System.out.println("---------------------");
		this.course = course;
	}
	public Test1()
	{
		System.out.println("Test1 Bean Created...");
	}
	

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
