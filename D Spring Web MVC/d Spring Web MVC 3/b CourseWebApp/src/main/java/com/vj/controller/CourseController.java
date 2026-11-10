package com.vj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vj.model.Course;

@Controller
public class CourseController {
	@GetMapping("/courseinfo")
	public String getCourseInfo(Model model) {
		model.addAttribute("cid", "T1");
		model.addAttribute("cname", "DevOps");
		model.addAttribute("price", "4999 INR");

		return "course";
		/*
		 * Welcome to Web App 
		 * Course Id is : T1 
		 * Course Name is : DevOps 
		 * Course Price is: 4999 INR
		 */
	}

	@GetMapping("/coursedetails")
	public String getCourseDetails(Model model) {
		Course course = new Course();
		course.setCid(1);
		course.setCname("DevOps with AWS");
		course.setPrice(8999.9);

		model.addAttribute("course", course);

		return "courseinfo";

		/*
		 * 
		 * Course Information 
		 * Course Id is : 1 
		 * Course Name is : DevOps with AWS Course
		 * Price is : 8999.9
		 * 
		 */

	}
}
