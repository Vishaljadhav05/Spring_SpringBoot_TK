package com.vj;

import com.vj.service.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.vj.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa1Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run( SpringDataJpa1Application.class, args);
		
		VaccineService service = container.getBean(VaccineServiceImpl.class);
		
		/* 
		String status = service.registerVaccineInfo(new Vaccine("Phizer","Moderena",45453.5));
		
		System.out.println(status);
		
		// -------------------------------------------------------
		
		
		Vaccine vac1 = new Vaccine("Polio","WHO",6435.8);
		
		Vaccine vac2 = new Vaccine("Covishield","Astrazenica",8574.50);
		
		Vaccine vac3 = new Vaccine("Covaxin","BharatBio",500.8);
		
		List<Vaccine> vaccines_list = new ArrayList<Vaccine>();
		
		vaccines_list.add(vac1);
		vaccines_list.add(vac2);
		vaccines_list.add(vac3);
		
		 service.registerMulipeVaccineInfo(vaccines_list).forEach(v->System.out.println(v));
		*/
		Long count = service.vaccineCount();
		System.out.println("Number of Vaccines are available : "+count);
		
		int id = 2;
		Boolean status =  service.checkVaccineAvailability(id);
		if(status)
			System.out.println("Vaccine with id "+ id +" is available.");
		else
			System.out.println("Vaccine with id "+ id +" is not available!!!");
		
		/*
		Iterable<Vaccine> all_vac = service.getAllVaccines();
		
		for (Vaccine vaccine : all_vac) {
			System.out.println(vaccine);
		}
		*/
		
		service.getAllVaccines().forEach(e-> System.out.println(e));
	}

}


// Output:-

/*

[2m2026-09-09T10:27:22.170+05:30[0;39m [32m INFO[0;39m [35m15072[0;39m [2m--- [ca_Spring_Data_JPA-1] [           main] [0;39m[36morg.hibernate.orm.core                  [0;39m [2m:[0;39m HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: 
    create table vaccine (
        id integer not null,
        cost float(53) not null,
        vaccine_company varchar(255),
        vaccine_name varchar(255),
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    create table vaccine_seq (
        next_val bigint
    ) engine=InnoDB
    
Hibernate: 
    insert into vaccine_seq ( next_val ) values ( 1 )
[2m2026-09-09T10:27:22.359+05:30[0;39m [32m INFO[0;39m [35m15072[0;39m [2m--- [ca_Spring_Data_JPA-1] [           main] [0;39m[36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Initialized JPA EntityManagerFactory for persistence unit 'default'
[2m2026-09-09T10:27:22.488+05:30[0;39m [32m INFO[0;39m [35m15072[0;39m [2m--- [ca_Spring_Data_JPA-1] [           main] [0;39m[36mo.s.d.j.r.query.QueryEnhancerFactories  [0;39m [2m:[0;39m Hibernate is in classpath; If applicable, HQL parser will be used.
[2m2026-09-09T10:27:22.830+05:30[0;39m [32m INFO[0;39m [35m15072[0;39m [2m--- [ca_Spring_Data_JPA-1] [           main] [0;39m[36mcom.vj.SpringDataJpa1Application        [0;39m [2m:[0;39m Started SpringDataJpa1Application in 6.11 seconds (process running for 6.884)

Hibernate: 
    select
        next_val as id_val 
    from
        vaccine_seq 
    for
        update
Hibernate: 
    update
        vaccine_seq 
    set
        next_val= ? 
    where
        next_val=?
Hibernate: 
    insert 
    into
        vaccine
        (cost, vaccine_company, vaccine_name, id) 
    values
        (?, ?, ?, ?)
Vaccine Info registered with id : 1
---------------------------------------------
 
mysql> select * from vaccine;
+----+---------+-----------------+--------------+
| id | cost    | vaccine_company | vaccine_name |
+----+---------+-----------------+--------------+
|  1 | 45453.5 | Moderena        | Phizer       |
+----+---------+-----------------+--------------+
1 row in set (0.00 sec)


=============================================================================================

Hibernate: 
    select
        next_val as id_val 
    from
        vaccine_seq 
    for
        update
Hibernate: 
    update
        vaccine_seq 
    set
        next_val= ? 
    where
        next_val=?
Hibernate: 
    insert 
    into
        vaccine
        (cost, vaccine_company, vaccine_name, id) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        vaccine
        (cost, vaccine_company, vaccine_name, id) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        vaccine
        (cost, vaccine_company, vaccine_name, id) 
    values
        (?, ?, ?, ?)
Vaccine [id=2, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
Vaccine [id=3, vaccineName=Covishield, vaccineCompany=Astrazenica, cost=8574.5]
Vaccine [id=4, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]



-------------------------------------------------------------------

mysql> select * from vaccine;
+----+---------+-----------------+--------------+
| id | cost    | vaccine_company | vaccine_name |
+----+---------+-----------------+--------------+
|  1 | 45453.5 | Moderena        | Phizer       |
|  2 |  6435.8 | WHO             | Polio        |
|  3 |  8574.5 | Astrazenica     | Covishield   |
|  4 |   500.8 | BharatBio       | Covaxin      |
+----+---------+-----------------+--------------+
4 rows in set (0.00 sec)



=============================================================================================


Hibernate: 
    select
        count(*) 
    from
        vaccine v1_0
Number of Vaccines are available : 4
Hibernate: 
    select
        count(*) 
    from
        vaccine v1_0 
    where
        v1_0.id=?
Vaccine with id 2 is available.


Hibernate: 
    select
        v1_0.id,
        v1_0.cost,
        v1_0.vaccine_company,
        v1_0.vaccine_name 
    from
        vaccine v1_0
Vaccine [id=1, vaccineName=Phizer, vaccineCompany=Moderena, cost=45453.5]
Vaccine [id=2, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
Vaccine [id=3, vaccineName=Covishield, vaccineCompany=Astrazenica, cost=8574.5]
Vaccine [id=4, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]


*/