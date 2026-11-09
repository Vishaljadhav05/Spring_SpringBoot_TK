package com.vj.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController 
{

	@GetMapping("/key")
	public String displayTheResp(Map<String, Object> map)
	{
		
		map.put("key", "Implementing using Map");
		
		return "key";
	}
	
	
	// Whenever endpoint and logical view page name matches no need to return it, but not recommended
	/*
	@GetMapping("/key")
	public void displayTheResp(Map<String, Object> map)
	{
		
		map.put("key", "Implementing using Map");
		
		return;
	}
	*/
	
}

//Output on Browser :

/*

Through Map : key,value
Implementing using Map

*/
