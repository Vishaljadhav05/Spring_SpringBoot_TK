package in.vj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.vj.controller.Student;

@RestController
@RequestMapping("/api2")
public class StudentController
{
	@GetMapping("/stdinfo")
	public ResponseEntity<Student> studentInfo()
	{
		Student std = new Student(1,"Vishal","Indore");
		
		return new ResponseEntity<Student>(std,HttpStatus.OK);
	}
	// http://localhost:8080/api2/stdinfo {get}
	
//	{
//	    "id": 1,
//	    "name": "Vishal",
//	    "city": "Indore"
//	}
//	
	
	@PostMapping("/add")
	public String addstudent(@RequestBody Student data)
	{
		System.out.print(data);
		
		return "Data Saved";
	}
	// http://localhost:8080/api2/add {post}
	
	// Data Saved
	// Student [id=2, name=Vijay, city=Ujjain]  : we passed this data
}
