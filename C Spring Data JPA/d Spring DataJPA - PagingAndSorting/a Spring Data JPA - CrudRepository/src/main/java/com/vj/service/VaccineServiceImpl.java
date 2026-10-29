package com.vj.service;

import java.util.List;
import java.util.Optional;

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
	public Iterable<Vaccine> getAllVaccinesById(Iterable<Integer> ids)
	{
		return vaccineRepository.findAllById(ids);
	}



	@Override
	public Optional<Vaccine> getVaccineById(Integer id) {
		
		return vaccineRepository.findById(id);
	}




	@Override
	public String removeVaccineById(Integer id) 
	{
		/*
		Optional<Vaccine> optional = vaccineRepository.findById(id);
		if(optional.isPresent())
		{
			vaccineRepository.deleteById(id);
			return "Record with id "+id+" is deleted.";
		}
		
		return "Record with id "+id+" is not available to deleted.";
		*/
		
		Boolean status = vaccineRepository.existsById(id);
		if(status)
		{
			vaccineRepository.deleteById(id);
			return "Record with id "+id+" is deleted.";
		}
		return "Record with id "+id+" is not available to deleted.";
	}




	@Override
	public String removeVaccineByVaccine(Vaccine vaccine) 
	{
		Integer id = vaccine.getId();
		Optional<Vaccine> optional = vaccineRepository.findById(id);
		if(optional.isPresent())
		{
			vaccineRepository.deleteById(id);
			return "Record with id "+id+" is deleted.";
		}
		
		return "Record with id "+id+" is not available to deleted.";
	}




	@Override
	public String removeAllVaccinesById(List<Integer> ids) {

		List<Vaccine> vac = (List<Vaccine>)vaccineRepository.findAllById(ids);
		
		// It will not delete if any one single record is not present.
		/*
		
		int count1 = ids.size();
		int count2 = vac.size();
		
		if(count1 == count2)
		{
			vaccineRepository.deleteAllById(ids);
			System.out.println("Vaccine info deleted ..");
		}
		return "Failed to delete vaccine info";
		
		 */
		
		 // Other way to delete the data ,it will delete the data if a single record is not present.
		
		int count2 = vac.size();
		
		if(count2 > 0)
		{
			vaccineRepository.deleteAllById(ids);
			System.out.println("Vaccine info deleted ..");
		}
		return "Failed to delete vaccine info";
	}

}
