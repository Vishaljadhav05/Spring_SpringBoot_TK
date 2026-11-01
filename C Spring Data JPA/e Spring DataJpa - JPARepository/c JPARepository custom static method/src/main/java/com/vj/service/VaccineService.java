package com.vj.service;

import java.util.List;

import com.vj.view.ResultView;

public interface VaccineService 
{
	
	public List<ResultView> fetchByCost(Double cost);
}
