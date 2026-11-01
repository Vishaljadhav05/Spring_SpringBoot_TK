package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.vj.entity.Vaccine;
import com.vj.repo.VaccineRepository;
import com.vj.view.ResultView;

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
	public String removeVaccineInfoByIds(Iterable<Integer> ids) 
	{
		List<Vaccine> list = repo.findAllById(ids);
		
		if(list.size() != 0)
		{
			repo.deleteAllByIdInBatch(ids);
			return "Records deleted for given ids";
		}
		return "Unable to delete ethe records";
	}



}
