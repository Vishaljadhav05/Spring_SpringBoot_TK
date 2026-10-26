package com.vj.service;

import com.vj.entity.Vaccine;

public interface VaccineService 
{
	public String registerVaccineInfo(Vaccine vaccine);
	
	public Iterable<Vaccine> registerMulipeVaccineInfo(Iterable<Vaccine> vaccine);
	
	public Long vaccineCount();
	
	public Boolean checkVaccineAvailability(Integer id);
	
	public Iterable<Vaccine> getAllVaccines();
}
