package com.vj;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
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
		
		service.fetchByCost(8574.5).forEach(e-> System.out.println(e));
		System.out.println("-----------------------------");
		service.fetchByCostLessThanEqual(8574.5).forEach(e-> System.out.println(e));
		
		System.out.println("-----------------------------");
		service.fetchByCostBetween(6000.00,9000.00).forEach(e-> System.out.println(e));
		
		System.out.println("-----------------------------");
		service.fetchByVaccineCompanyEquals("BharatBio").forEach(e-> System.out.println(e));
		
		System.out.println("-----------------------------");
		Collection<String> vacNames = new HashSet<String>();
		vacNames.add("Covishield");
		vacNames.add("Covaxin");
		
		service.fetchByVaccineNameInAndCostBetween(vacNames,6000.00,9000.00).forEach(e-> System.out.println(e));
	
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
        v1_0.cost=?
Vaccine [id=3, vaccineName=Covishield, vaccineCompany=Astrazenica, cost=8574.5]
-----------------------------
Hibernate: 
    select
        v1_0.id,
        v1_0.cost,
        v1_0.vaccine_company,
        v1_0.vaccine_name 
    from
        vaccine v1_0 
    where
        v1_0.cost<=?
Vaccine [id=2, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
Vaccine [id=3, vaccineName=Covishield, vaccineCompany=Astrazenica, cost=8574.5]
Vaccine [id=54, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]
-----------------------------
Hibernate: 
    select
        v1_0.id,
        v1_0.cost,
        v1_0.vaccine_company,
        v1_0.vaccine_name 
    from
        vaccine v1_0 
    where
        v1_0.cost between ? and ?
Vaccine [id=2, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
Vaccine [id=3, vaccineName=Covishield, vaccineCompany=Astrazenica, cost=8574.5]
-----------------------------
Hibernate: 
    select
        v1_0.id,
        v1_0.cost,
        v1_0.vaccine_company,
        v1_0.vaccine_name 
    from
        vaccine v1_0 
    where
        v1_0.vaccine_company=?
Vaccine [id=54, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]
-----------------------------
Hibernate: 
    select
        v1_0.id,
        v1_0.cost,
        v1_0.vaccine_company,
        v1_0.vaccine_name 
    from
        vaccine v1_0 
    where
        v1_0.vaccine_name in (?, ?) 
        and v1_0.cost between ? and ?
Vaccine [id=3, vaccineName=Covishield, vaccineCompany=Astrazenica, cost=8574.5]


*/