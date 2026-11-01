package com.vj.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vj.repo.VaccineRepository;
import com.vj.view.View;

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
	public <T extends View> List<T> findByCostLessThan(Double cost, Class<T> cls) {
		
		return repo.findByCostLessThan(cost, cls);
	}



}
