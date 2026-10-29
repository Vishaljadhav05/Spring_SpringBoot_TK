package com.vj.service;

import java.util.List;
import java.util.Optional;

import com.vj.entity.Vaccine;

public interface VaccineService 
{
	
	public Iterable<Vaccine> getAllVaccinesById(Iterable<Integer> ids);
	
	public Optional<Vaccine> getVaccineById(Integer id);
	
	public String removeVaccineById(Integer id);
	
	public String removeVaccineByVaccine(Vaccine vaccine);
	
	public String removeAllVaccinesById(List<Integer> ids);
}
