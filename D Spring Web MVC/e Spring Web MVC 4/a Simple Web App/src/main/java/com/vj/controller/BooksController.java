package com.vj.controller;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BooksController {

	@GetMapping("/home")
	public String showHomePage() {
		return "home";

		/*
		 * http://localhost:8484/home
		 * 
		 * Home Page Click Here to get Response From App
		 * 
		 */
	}

	@GetMapping("/resp")
	public String getBookInfo(Map<String, Object> map) {

		String bookName[] = new String[] { "Java", "Spring Boot", "Hibernate" };

		map.put("books", bookName);
		return "response";

		/*
		 * http://localhost:8484/resp
		 * 
		 * Displaying Data From an Array/Collection Books name: Java
		 * 
		 * Books name: Spring Boot
		 * 
		 * Books name: Hibernate
		 */
	}

}
