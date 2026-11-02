package com.vj.service;


import java.util.Collection;
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
	public List<Vaccine> fetchByCost(double cost) 
	{
		
		return repo.findByCost(cost);
	}

	@Override
	public List<Vaccine> fetchByCostLessThanEqual(double cost) {
		
		return repo.findByCostLessThanEqual(cost);
	}

	@Override
	public List<Vaccine> fetchByCostBetween(double startCost, double endCost) {
		// TODO Auto-generated method stub
		return repo.findByCostBetween(startCost, endCost);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompanyEquals(String name) {
		// TODO Auto-generated method stub
		return repo.findByVaccineCompanyEquals(name);
	}

	@Override
	public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> names, double minCost, double maxCost) {
		// TODO Auto-generated method stub
		return repo.findByVaccineNameInAndCostBetween(names, minCost, maxCost);
	}




}
