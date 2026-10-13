package services;

public class SpringBootCourse implements ICourse
{

	@Override
	public Boolean getTheCourse(Double amount) {
		
		System.out.println("SpringBoot course is purchased and the fees paid is : "+ amount);
		return true;
	}

}
