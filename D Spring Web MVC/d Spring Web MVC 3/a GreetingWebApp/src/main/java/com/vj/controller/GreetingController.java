package com.vj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vj.service.GreetingService;

import jakarta.servlet.http.HttpServletResponse;

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
	
	@GetMapping("/wish")
	public void generateWish2(HttpServletResponse resp) throws IOException
	{
		String greeting = greetingService.generateWish("Saurabh");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<h1>Hello, this response comes from controller directly "+ greeting+" </h1>");
	}
}


// Output on browser:-

/*

http://localhost:8080/GreetingApp/wish

Hello, this response comes from controller directly Good Evening ! Saurabh


*/