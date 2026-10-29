package com.vj.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public Iterable<Vaccine> fetchDetailsBySorting(Boolean status, String... properties) 
	{
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
	}


	@Override
	public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize, Boolean status, String... properties) 
	{
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		PageRequest pageable = PageRequest.of(pgNo, pgSize, sort);
		
		Page<Vaccine> page = repo.findAll(pageable);
		return page.getContent();
	}


	@Override
	public void fetchDeatilsByPaginatation(int pageSize) 
	{
		long count = 7l;
		
		long pageCount = count/pageSize;
		
		// 14/5 = 2.8 (It will truncate the data
		pageCount = count % pageSize == 0 ? pageCount : ++pageCount;
		
		for(int i = 0;i<pageCount ;i++)
		{
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(pageable);
			page.getContent().forEach(v-> System.out.println(v.getVaccineName() +" " +v.getVaccineCompany()));
			System.out.println("******PAGE********");
		}
		
	}
}
