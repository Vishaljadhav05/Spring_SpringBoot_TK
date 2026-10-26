package com.vj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.entity.Student;
import com.vj.repo.StudentRepository;

@Component
public class DataJpaRunner implements CommandLineRunner 
{
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println(studentRepository.getClass().getName());
		studentRepository.save(new Student(101,"Vishal","Indore"));
		
	}

}
