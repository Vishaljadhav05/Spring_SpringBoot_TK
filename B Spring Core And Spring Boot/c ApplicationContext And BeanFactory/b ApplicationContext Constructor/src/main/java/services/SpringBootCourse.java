package services;

public class SpringBootCourse implements ICourse
{
	
	public SpringBootCourse()
	{
		System.out.println("SpringBootCourse Bean Created ...");
	}

	@Override
	public Boolean getTheCourse(Double amount) {
		
		System.out.println("SpringBoot course is purchased and the fees paid is : "+ amount);
		return true;
	}

}
