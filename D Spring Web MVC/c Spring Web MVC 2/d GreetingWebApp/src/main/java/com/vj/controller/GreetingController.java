package com.vj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vj.service.GreetingService;

@Controller
public class GreetingController 
{
	@Autowired
	private GreetingService greetingService;
	
	
	@GetMapping("/greet")
	public String generateWish(Model model)
	{
		String greeting = greetingService.generateWish("Vishal");
		
		model.addAttribute("wish", greeting);
		
		return "greetings";
	}
}


// Output on browser:-

/*

http://localhost:8080/GreetingApp/greet

Welcome to Web App
Good Afternoon ! Vishal


*/