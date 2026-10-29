package com.vj.service;

import java.util.List;

import com.vj.entity.Vaccine;

public interface VaccineService 
{
	public Iterable<Vaccine> fetchDetailsBySorting(Boolean status,String... properties);
	
	
	// If we are giving the parameters then it will do it by both ie. pagination and sorting also
	public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize,Boolean status,String... properties);
	
	public void fetchDeatilsByPaginatation(int pageSize);
}
