package com.vj.service;

import java.util.List;

import com.vj.entity.Vaccine;

public interface VaccineService 
{
	public Vaccine searchVaccineById(Integer id);
	
	public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac);
}
