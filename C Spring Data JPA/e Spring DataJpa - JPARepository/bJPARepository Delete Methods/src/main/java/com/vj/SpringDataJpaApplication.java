package com.vj;

import java.util.ArrayList;
import java.util.List;

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
		
		List<Integer> ids = new ArrayList<>();
		ids.add(150);
		ids.add(52);
		ids.add(4);
		
		String status = service.removeVaccineInfoByIds(ids);
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
        v1_0.id in (?, ?, ?)
Hibernate: 
    delete v1_0 
    from
        vaccine v1_0 
    where
        v1_0.id in (?, ?, ?)
Records deleted for given ids


*/