package com.vj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public ModelAndView display()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello! Welcome to our first web app");
		mv.setViewName("index");
		
		return mv;
	}
	
	@GetMapping("/welcome2")
	public ModelAndView display2()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello! Enjoy your day");
		mv.setViewName("index");
		
		return mv;
	}
}
