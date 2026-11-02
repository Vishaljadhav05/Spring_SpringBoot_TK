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
		
		service.fetchByVaccineCompany("WHO").forEach(e->System.out.println(e));
		
		System.out.println("-----------------------------------");
		service.fetchByVaccineCompany("WHO","BharatBio").forEach(e->System.out.println(e));
		
		System.out.println("-----------------------------------");
		service.fetchVaccineByCost(6000.00,9000.00).forEach(e->System.out.println(e));

		/*
		
		// Data Updation
		System.out.println("-----------------------------------");
		int rowAffected =service.updateThePriceByVaccineName(800.40,"Covaxin");
		
		if(rowAffected != 0)
			System.out.println("Updated Successfully");
		else
			System.out.println("Updation Failed !!!");
		
		
		// Data deletion
		System.out.println("-----------------------------------");
		
		int rowDeleted =service.deleteVaccineThroughVaccineName("Spikevax");
		
		if(rowDeleted != 0)
			System.out.println("Record Deleted ");
		else
			System.out.println("Deletion Failed !!!");
			
	
		 
		
		// Adding the data 
		System.out.println("-----------------------------------");
		int rowAffected =service.addingTheVaccine(30,"Nuvaxovid","Novavax",1400.9);
				
		if(rowAffected != 0)
			System.out.println("Record Added Successfully");
		else
			System.out.println("Addition Failed !!!");
			
		 */
		
		System.out.println("-----------------------------------");
		System.out.println(service.getTheSystemDateAndTime());
		
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
        v1_0.vaccine_company=?
Vaccine [id=2, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
-----------------------------------
Hibernate: 
    select
        v1_0.id,
        v1_0.cost,
        v1_0.vaccine_company,
        v1_0.vaccine_name 
    from
        vaccine v1_0 
    where
        v1_0.vaccine_company in (?, ?)
Vaccine [id=2, vaccineName=Polio, vaccineCompany=WHO, cost=6435.8]
Vaccine [id=54, vaccineName=Covaxin, vaccineCompany=BharatBio, cost=500.8]
-----------------------------------
Hibernate: 
    select
        v1_0.vaccine_name,
        v1_0.vaccine_company 
    from
        vaccine v1_0 
    where
        v1_0.cost between ? and ?
Polio,WHO
Covishield,Astrazenica
-----------------------------------
Hibernate: 
    update
        vaccine v1_0 
    set
        cost=? 
    where
        v1_0.vaccine_name=?
Updated Successfully

---> Before <---

mysql> select * from vaccine;
+----+---------+--------------------------+--------------+
| id | cost    | vaccine_company          | vaccine_name |
+----+---------+--------------------------+--------------+
|  1 | 45453.5 | Moderena                 | Phizer       |
|  2 |  6435.8 | WHO                      | Polio        |
|  3 |  8574.5 | Astrazenica              | Covishield   |
| 21 |     780 | Serum Institute of India | Covishield   |
| 23 |    1500 | Pfizer                   | Comirnaty    |
| 24 |    2200 | Moderna                  | Spikevax     |
| 25 |     250 | Bharat Biotech           | Rotavac      |
| 54 |   500.8 | BharatBio                | Covaxin      |
+----+---------+--------------------------+--------------+
8 rows in set (0.00 sec)

 ---> After <---
 
 mysql> select * from vaccine;
+----+---------+--------------------------+--------------+
| id | cost    | vaccine_company          | vaccine_name |
+----+---------+--------------------------+--------------+
|  1 | 45453.5 | Moderena                 | Phizer       |
|  2 |  6435.8 | WHO                      | Polio        |
|  3 |  8574.5 | Astrazenica              | Covishield   |
| 21 |     780 | Serum Institute of India | Covishield   |
| 23 |    1500 | Pfizer                   | Comirnaty    |
| 24 |    2200 | Moderna                  | Spikevax     |
| 25 |     250 | Bharat Biotech           | Rotavac      |
| 54 |   800.4 | BharatBio                | Covaxin      |
+----+---------+--------------------------+--------------+
8 rows in set (0.00 sec)


-----------------------------------
Hibernate: 
    delete v1_0 
    from
        vaccine v1_0 
    where
        v1_0.vaccine_name=?
Record Deleted 
---> Before <---
 
  mysql> select * from vaccine;
+----+---------+--------------------------+--------------+
| id | cost    | vaccine_company          | vaccine_name |
+----+---------+--------------------------+--------------+
|  1 | 45453.5 | Moderena                 | Phizer       |
|  2 |  6435.8 | WHO                      | Polio        |
|  3 |  8574.5 | Astrazenica              | Covishield   |
| 21 |     780 | Serum Institute of India | Covishield   |
| 23 |    1500 | Pfizer                   | Comirnaty    |
| 24 |    2200 | Moderna                  | Spikevax     |
| 25 |     250 | Bharat Biotech           | Rotavac      |
| 54 |   800.4 | BharatBio                | Covaxin      |
+----+---------+--------------------------+--------------+
8 rows in set (0.00 sec)

 ---> After <---
 
 +----+---------+--------------------------+--------------+
| id | cost    | vaccine_company          | vaccine_name |
+----+---------+--------------------------+--------------+
|  1 | 45453.5 | Moderena                 | Phizer       |
|  2 |  6435.8 | WHO                      | Polio        |
|  3 |  8574.5 | Astrazenica              | Covishield   |
| 21 |     780 | Serum Institute of India | Covishield   |
| 23 |    1500 | Pfizer                   | Comirnaty    |
| 25 |     250 | Bharat Biotech           | Rotavac      |
| 54 |   800.4 | BharatBio                | Covaxin      |
+----+---------+--------------------------+--------------+
7 rows in set (0.00 sec)

-----------------------------------
Hibernate: 
    INSERT 
    INTO
        Vaccine
        (id, vaccine_name, vaccine_company, cost) 
    VALUES
        (?, ?, ?, ?)
Record Added Successfully

---> Before <---

mysql> select * from vaccine;
+----+---------+--------------------------+--------------+
| id | cost    | vaccine_company          | vaccine_name |
+----+---------+--------------------------+--------------+
|  1 | 45453.5 | Moderena                 | Phizer       |
|  2 |  6435.8 | WHO                      | Polio        |
|  3 |  8574.5 | Astrazenica              | Covishield   |
| 21 |     780 | Serum Institute of India | Covishield   |
| 23 |    1500 | Pfizer                   | Comirnaty    |
| 25 |     250 | Bharat Biotech           | Rotavac      |
| 54 |   800.4 | BharatBio                | Covaxin      |
+----+---------+--------------------------+--------------+
7 rows in set (0.00 sec)


---> After <---
mysql> select * from vaccine;
+----+---------+--------------------------+--------------+
| id | cost    | vaccine_company          | vaccine_name |
+----+---------+--------------------------+--------------+
|  1 | 45453.5 | Moderena                 | Phizer       |
|  2 |  6435.8 | WHO                      | Polio        |
|  3 |  8574.5 | Astrazenica              | Covishield   |
| 21 |     780 | Serum Institute of India | Covishield   |
| 23 |    1500 | Pfizer                   | Comirnaty    |
| 25 |     250 | Bharat Biotech           | Rotavac      |
| 28 |  5500.9 | GlaxoSmithKline          | Shingrix     |
| 54 |   800.4 | BharatBio                | Covaxin      |
+----+---------+--------------------------+--------------+
8 rows in set (0.00 sec)


-----------------------------------
Hibernate: 
    SELECT
        NOW() 
    FROM
        DUAL
2026-10-13T16:55:40

*/