package services;

public class JavaCourse implements ICourse
{

	public JavaCourse()
	{
		System.out.println("JavaCourse Bean Created ...");
	}
	
	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Java course is purchased and the fees paid is : "+ amount);
		return true;
	}

}
