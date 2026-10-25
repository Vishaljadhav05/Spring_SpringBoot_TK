package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vj.dao.EmployeeDaoImpl;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcApplication.class, args);
		
		 EmployeeDaoImpl dao = container.getBean(EmployeeDaoImpl.class);
		 
		 /*
		 List<Employee>list = dao.getEmployeeInfo();
		 
		 for (Employee e : list) 
		 {
			System.out.println(e);
		 }
		 
		 list.forEach(e->System.out.println(e));
		 */
		 
		 dao.getEmployeeInfo().forEach(e->System.out.println(e));
	}

}


// output :-

/*

Employee [id=1, name=Rohan, city=Bangaluru]
Employee [id=2, name=Ram, city=Mumbai]
Employee [id=3, name=Uday, city=Indore]

*/
