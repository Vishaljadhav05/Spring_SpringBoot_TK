package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vj.entity.Vaccine;
import com.vj.service.VaccineService;
import com.vj.service.VaccineServiceImpl;

import jakarta.transaction.Transactional;

@Transactional
@SpringBootApplication
public class SpringDataJpaApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run( SpringDataJpaApplication.class, args);
		
		VaccineService service = container.getBean(VaccineServiceImpl.class);
		
		// Vaccine vac = service.searchVaccineById(53);
		
		// System.out.println(vac);
		
		Vaccine vac1 = new Vaccine("Polio","WHO",6435.8);
		vac1.setId(52);
		
		
		service.searchVaccineByGivenInfo(vac1).forEach(v->System.out.println(v));
	}

}


// Output:-

/*

Hibernate: 
    select
        v1_0.id,
        v1_0.cost,
        v1_0.vaccine_company,
        v1_0.vaccine_name 
    from
        vaccine v1_0 
    where
        v1_0.vaccine_name=? 
        and v1_0.id=? 
        and v1_0.vaccine_company=? 
        and v1_0.cost=?
Vaccine [id=52, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]


*/