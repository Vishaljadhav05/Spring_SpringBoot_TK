package com.vj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.entity.Vaccine;
import com.vj.repo.VaccineRepository;

@Service
public class VaccineServiceImpl implements VaccineService
{
	private final  VaccineRepository vaccineRepository;

	@Autowired
	VaccineServiceImpl(VaccineRepository vaccineRepository) 
	{
		this.vaccineRepository = vaccineRepository;
	}

	
	
	@Override
	public String registerVaccineInfo(Vaccine vaccine)
	{
		Vaccine vac = vaccineRepository.save(vaccine);
		return "Vaccine Info registered with id : " + vac.getId();
	}

	@Override
	public Iterable<Vaccine> registerMulipeVaccineInfo(Iterable<Vaccine> vaccine) 
	{
		Iterable<Vaccine> vac = vaccineRepository.saveAll(vaccine);
		return vac;
	}



	@Override
	public Long vaccineCount() 
	{
//		Long count = vaccineRepository.count();
//		return count;
		
		return vaccineRepository.count();
	}



	@Override
	public Boolean checkVaccineAvailability(Integer id) 
	{
//		Boolean existence = vaccineRepository.existsById(id);
//		return existence;
		
		return vaccineRepository.existsById(id);
	}



	@Override
	public Iterable<Vaccine> getAllVaccines() 
	{
		
		return vaccineRepository.findAll();
	}

}
