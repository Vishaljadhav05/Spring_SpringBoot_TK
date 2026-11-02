package com.vj.service;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.entity.Vaccine;
import com.vj.repo.VaccineRepository;
@Service
public class VaccineServiceImpl implements VaccineService
{
	private VaccineRepository repo;
	
	@Autowired
	public void setRepo(VaccineRepository repo)
	{
		this.repo = repo;
	}


	@Override
	public List<Vaccine> fetchByVaccineCompany(String companyName) {
		// TODO Auto-generated method stub
		return repo.searchByVaccineCompany(companyName);
	}


	@Override
	public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2) {
		// TODO Auto-generated method stub
		return repo.searchByVaccineCompany(comp1, comp2);
	}


	@Override
	public List<String> fetchVaccineByCost(Double stRange, Double endRange) {
		// TODO Auto-generated method stub
		return repo.searchVaccineByCost(stRange,endRange);
	}


	@Override
	public int updateThePriceByVaccineName(Double newPrice, String vacName) {
		// TODO Auto-generated method stub
		return repo.updatePriceByVaccineName(newPrice, vacName);
	}


	@Override
	public int deleteVaccineThroughVaccineName(String vacName) {
		// TODO Auto-generated method stub
		return repo.deleteVaccineByVaccineName(vacName);
	}


	@Override
	public int addingTheVaccine(Integer id, String vacName, String vacCompany, Double cost) {
		
		return repo.addTheVaccine( id,vacName, vacCompany, cost);
	}


	@Override
	public LocalDateTime getTheSystemDateAndTime() {
		// TODO Auto-generated method stub
		return repo.getSystemDateAndTime();
	}

	
}
