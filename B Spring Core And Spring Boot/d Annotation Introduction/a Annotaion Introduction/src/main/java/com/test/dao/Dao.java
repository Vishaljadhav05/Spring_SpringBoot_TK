package com.test.dao;

import org.springframework.stereotype.Repository;

@Repository // Name of the bean = dao
public class Dao 
{
	public Dao()
	{
		System.out.println("Dao bean created...");
	}
}
