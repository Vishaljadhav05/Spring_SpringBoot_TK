package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public Vaccine searchVaccineById(Integer id) 
	{
		return repo.getReferenceById(id);
	}

	@Override
	public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac) 
	{
		// Sort sort =  Sort.by(status ? Direction.ASC: Direction.DESC, param);
		
		Example<Vaccine> example = Example.of(vac);
		
		return repo.findAll(example);
		
	}


}
