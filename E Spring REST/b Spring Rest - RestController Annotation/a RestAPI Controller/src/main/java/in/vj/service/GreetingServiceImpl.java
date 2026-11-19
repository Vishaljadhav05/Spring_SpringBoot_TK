package in.vj.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService
{
	@Override
	public String generateWish(String name)
	{
		
		LocalDateTime time = LocalDateTime.now();
		int hour = time.getHour();
		
		if(hour <12)
			return "Good Morning ! "+name;
		else if(hour <16)
			return "Good Afternoon ! "+name;
		else if(hour <20)
			return "Good Evening ! "+name;
		else
			return "Good Night ! "+name;
	}

}
