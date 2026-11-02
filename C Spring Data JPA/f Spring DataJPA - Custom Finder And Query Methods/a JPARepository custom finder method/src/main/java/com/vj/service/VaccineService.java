package com.vj.service;

import java.util.Collection;
import java.util.List;

import com.vj.entity.Vaccine;

public interface VaccineService 
{
	public List<Vaccine> fetchByCost(double cost);
	
	public List<Vaccine> fetchByCostLessThanEqual(double cost);
	
	public List<Vaccine> fetchByCostBetween(double startCost,double endCost);
	
	public List<Vaccine> fetchByVaccineCompanyEquals(String name);
	
	public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> names,double minCost,double maxCost);
}
