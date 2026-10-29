package com.vj;

import com.vj.repo.VaccineRepository;
import com.vj.service.VaccineServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vj.entity.Vaccine;
import com.vj.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa1Application 
{

	private final VaccineRepository vaccineRepository;

	SpringDataJpa1Application(VaccineRepository vaccineRepository, VaccineServiceImpl vaccineServiceImpl) {
		this.vaccineRepository = vaccineRepository;
	}

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run( SpringDataJpa1Application.class, args);
		
		VaccineService service = container.getBean(VaccineServiceImpl.class);
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(4);
		ids.add(2);
		
		service.getAllVaccinesById(ids).forEach(v-> System.out.println(v));
		
		
		Integer id = 1;
		Optional<Vaccine> optional = service.getVaccineById(id);
		
		if(optional.isPresent())
			System.out.println("Vaccine with id : "+ optional.get());
		else
			System.out.println("Vaccine with id "+ id +"not present !!!");
		
		
		//-------------------------------------------
		id = 5;
		String status = service.removeVaccineById(id);
		System.out.println(status);
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
        v1_0.id in (?, ?)
Vaccine [id=2, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
Vaccine [id=4, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]



=============================================================================================

Hibernate: 
    select
        v1_0.id,
        v1_0.cost,
        v1_0.vaccine_company,
        v1_0.vaccine_name 
    from
        vaccine v1_0 
    where
        v1_0.id=?
Vaccine with id : Vaccine [id=1, vaccineName=Phizer, vaccineCompany=Moderena, cost=45453.5]

=============================================================================================

Hibernate: 
    select
        count(*) 
    from
        vaccine v1_0 
    where
        v1_0.id=?
Record with id 5 is not available to deleted.


*/