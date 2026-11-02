package com.vj.service;

import java.time.LocalDateTime;
import java.util.List;

import com.vj.entity.Vaccine;

public interface VaccineService 
{
	public List<Vaccine> fetchByVaccineCompany(String companyName);
	
	public List<Vaccine> fetchByVaccineCompany(String comp1,String comp2);  
	
	public List<String> fetchVaccineByCost(Double stRange,Double endRange);
	
	public int updateThePriceByVaccineName(Double newPrice, String vacName);
	
	public int deleteVaccineThroughVaccineName(String vacName);
	
	public int addingTheVaccine(Integer id,String vacName,String vacCompany, Double cost);
	
	public LocalDateTime getTheSystemDateAndTime();
}
