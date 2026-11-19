package in.vj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.vj.service.GreetingService;

@RestController
@RequestMapping("/api")
public class GreetingsController
{
	@Autowired
	private GreetingService greeting;
	
	
	@GetMapping("/greet")
	public ResponseEntity<String> getWishes()
	{
		String resp = greeting.generateWish("Vishal");
		
		return new ResponseEntity<String>(resp,HttpStatus.OK);
	}
	
	@GetMapping("/greet2")
	public String getWishes2()
	{
		String resp = greeting.generateWish("Vijay");
		
		return resp;
	}
}
