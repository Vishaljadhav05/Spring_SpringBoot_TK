package com.vj.service;

import java.util.List;

import com.vj.view.View;

public interface VaccineService 
{
	
	public<T extends View> List<T> findByCostLessThan(Double cost,Class<T> cls);
}
