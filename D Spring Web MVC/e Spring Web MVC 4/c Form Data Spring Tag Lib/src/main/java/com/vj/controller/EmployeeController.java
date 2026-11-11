package com.vj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vj.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/register")
	public String showHomePage(@ModelAttribute("emp")Employee emp) {
		return "register";

		/*
		 * http://localhost:8484/register
		 * 
		 * Register Here Employee Id 101 Employee Name vishal Employee City Indore
		 * Employee Salary 90899.9
		 * 
		 */
	}

//	@GetMapping("/resp")
//	public String register(Map<String, Object> map, HttpServletRequest req) {
//
//		String name = req.getParameter("name"); // Not recommended
//		
//		return "response";
//
//	}

	@PostMapping("/reg")
	public String register(Map<String, Object> map, @ModelAttribute("emp")Employee emp) {

		// String name = req.getParameter("name"); / Not recommended

		System.out.println(emp);

		map.put("emp", emp);

		return "response";

		/*
		 * http://localhost:8484/reg
		 * 
		 * Page
		 *  Employee Id is : 101 
		 *  Employee Name is : vishal 
		 *  Employee City is : Indore
		 * Employee Salary is : 90899.9
		 * 
		 * Employee [id=1, ename=uiyh, ecity=yijf, esalary=45432.5]

		 */
	}

}
