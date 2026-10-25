package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vj.dao.EmployeeDao;
import com.vj.models.Employee;

@SpringBootApplication
public class SpringDataJdbc {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJdbc.class, args);
		
		// We use interface called CommandLineRunner ,inside it there is a run method which 
		// will automatically called by the above run() method internally.
		
		/*
		EmployeeDao dao = container.getBean(EmployeeDao.class);
		
		dao.input();
		*/
	}

}


// Output:-

/*

Data Inserted Successfully.

*/