package com.vj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vj")
public class MyController 
{
	@GetMapping("/welcome")
	public ModelAndView display()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello! Welcome to our first web app");
		mv.setViewName("index");
		
		return mv;
	}
	
	@GetMapping("/welcome2")
	public String displayTheResp(Model model)
	{
		
		System.out.println("Model is internally implemented by : "+model.getClass().getName());
		model.addAttribute("nyc", "Nyc to see you again");
		
		return "home";
	}
	
}

//Output on Browser :

/*

Home Page
Nyc to see you again

*/
