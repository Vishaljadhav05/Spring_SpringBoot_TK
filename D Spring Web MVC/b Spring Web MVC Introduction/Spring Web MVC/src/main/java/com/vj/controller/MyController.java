package com.vj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	@RequestMapping("/welcome")
	public ModelAndView display()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello! Welcome to our first web app");
		mv.setViewName("index");
		
		return mv;
	}
}
