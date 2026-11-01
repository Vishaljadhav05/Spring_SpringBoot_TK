package com.vj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vj.service.VaccineService;
import com.vj.service.VaccineServiceImpl;
import com.vj.view.ResultView1;
import com.vj.view.ResultView2;
import com.vj.view.ResultView3;

import jakarta.transaction.Transactional;

@Transactional
@SpringBootApplication
public class SpringDataJpaApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run( SpringDataJpaApplication.class, args);
		
		VaccineService service = container.getBean(VaccineServiceImpl.class);
	
		/*
		service.findByCostLessThan(8500.00, ResultView1.class)
		.forEach(e-> System.out.println(e.getVaccineName() + " : "+e.getVaccineCompany()));
		
		System.out.println("-------------------------------------");
		
		
		
		service.findByCostLessThan(8500.00, ResultView2.class)
		.forEach(e-> System.out.println(e.getVaccineName() + " : "+e.getVaccineCompany() +" -> " +e.getCost()));
		
		System.out.println("-------------------------------------");
		
		*/
		
		
		service.findByCostLessThan(8500.00, ResultView3.class)
		.forEach(e-> System.out.println(e.getId() + " : "+e.getVaccineName()));
		
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

-------------------------------------

Hibernate: 
    select
        v1_0.vaccine_name,
        v1_0.vaccine_company,
        v1_0.cost 
    from
        vaccine v1_0 
    where
        v1_0.cost<?
Polio : WHO -> 6435.8
Covaxin : BharatBio -> 500.8

-------------------------------------

Hibernate: 
    select
        v1_0.id,
        v1_0.vaccine_name 
    from
        vaccine v1_0 
    where
        v1_0.cost<?
2 : Polio
54 : Covaxin


*/