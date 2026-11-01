package com.vj;


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
	
		
		service.fetchByCost(8500.0).forEach(e-> System.out.println(e.getVaccineName()+" : " + e.getVaccineCompany()));
	}

}


// Output:-

/*

Hibernate: 
    select
        v1_0.vaccine_name,
        v1_0.vaccine_company 
    from
        vaccine v1_0 
    where
        v1_0.cost<?
Polio : WHO
Covaxin : BharatBio


*/