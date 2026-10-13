package services;

public class JavaCourse implements ICourse
{

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Java course is purchased and the fees paid is : "+ amount);
		return true;
	}

}
