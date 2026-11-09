package com.vj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vj")
public class MyController2 
{
	@GetMapping("/welcome3")
	public String displayTheResp(Model model)
	{
		
		System.out.println("Model is internally implemented by : "+model.getClass().getName());
		model.addAttribute("nyc", "Nyc to see you again : We are Learnign Web MVC");
		
		return "home";
	}
}


// Output on Browser :

/*

Home Page
Nyc to see you again : We are Learnign Web MVC

*/