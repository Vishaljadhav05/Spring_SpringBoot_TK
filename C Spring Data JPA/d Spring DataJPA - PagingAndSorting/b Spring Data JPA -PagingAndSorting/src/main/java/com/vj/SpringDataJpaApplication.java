package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vj.service.VaccineService;
import com.vj.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpaApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run( SpringDataJpaApplication.class, args);
		
		VaccineService service = container.getBean(VaccineServiceImpl.class);
		
		service.fetchDetailsBySorting(true, "vaccineName","vaccineCompany")
		.forEach(v->System.out.println(v));
		
		
		System.out.println("------------------------------");
		
		service.fetchDetailsByPagination(0, 2, true, "vaccineName").forEach(v->System.out.println(v));
		
		System.out.println("------------------------------");
		
		service.fetchDeatilsByPaginatation(2);
	}

}


// Output:-

/*
Vaccine [id=4, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]
Vaccine [id=54, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]
Vaccine [id=3, vaccineName=Covishield, vaccineCompany=Astrazenica, cost=8574.5]
Vaccine [id=53, vaccineName=Covishield, vaccineCompany=Astrazenica, cost=8574.5]
Vaccine [id=1, vaccineName=Phizer, vaccineCompany=Moderena, cost=45453.5]
Vaccine [id=2, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
Vaccine [id=52, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
------------------------------
Vaccine [id=4, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]
Vaccine [id=54, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]
------------------------------
Phizer Moderena
Polio WHO
******PAGE********
Covishield Astrazenica
Covaxin BharatBio
******PAGE********
Polio WHO
Covishield Astrazenica
******PAGE********
Covaxin BharatBio
******PAGE********
*/