package in.test;

import org.springframework.stereotype.Component;

@Component
public class Test // Bean of this class will not be created because it is not scanned by the applicationContext.xml file.
{
	public Test()
	{
		System.out.println("Test Bean is created...");
	}
}
