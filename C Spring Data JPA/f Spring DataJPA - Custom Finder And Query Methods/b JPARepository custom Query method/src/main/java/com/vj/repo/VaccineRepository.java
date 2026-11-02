package com.vj.repo;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.vj.entity.Vaccine;


public interface VaccineRepository extends JpaRepository<Vaccine, Integer>
{
	//In case of custom query method we can give any name of methods
	
	/*
	 
	@Query("FROM Vaccine WHERE vaccineCompany =: company") 
	public List<Vaccine> searchByVaccineCompany(String company);  
	// if field name is same then we don't need to use @Param annotation
	
	*/
	
	@Query("FROM Vaccine WHERE vaccineCompany =:company")
	public List<Vaccine> searchByVaccineCompany(@Param("company")String companyName);
	
	@Query("FROM Vaccine WHERE vaccineCompany IN(:comp1,:comp2)") 
	public List<Vaccine> searchByVaccineCompany(String comp1,String comp2);  
	
	
	@Query("Select vaccineName, vaccineCompany FROM Vaccine WHERE cost BETWEEN :stRange AND :endRange") 
	public List<String> searchVaccineByCost(Double stRange,Double endRange); 
	
	
	@Transactional // From spring family not from transactional family 
	@Modifying
	@Query("UPDATE Vaccine SET cost =:newPrice Where vaccineName =:vacName")
	public int updatePriceByVaccineName(Double newPrice, String vacName);
	
	
	@Transactional 
	@Modifying
	@Query("DELETE FROM Vaccine Where vaccineName =:vacName")
	public int deleteVaccineByVaccineName(String vacName);

	
	@Transactional 
	@Modifying
	@Query(value="INSERT INTO Vaccine (`id`,`vaccine_name`,`vaccine_company`,`cost`) VALUES (?,?,?,?)",nativeQuery = true)
	public int addTheVaccine(Integer id,String vacName,String vacCompany, Double cost);
	
	
	@Query(value="SELECT NOW() FROM DUAL",nativeQuery = true)
	public LocalDateTime getSystemDateAndTime();
	
}
