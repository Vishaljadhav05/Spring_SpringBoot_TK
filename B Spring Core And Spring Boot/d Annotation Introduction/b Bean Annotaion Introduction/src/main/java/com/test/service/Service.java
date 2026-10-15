package com.test.service;

import org.springframework.stereotype.Service;

@Service // name of the beans= serviceLayer
class ServiceLayer{
	
	 public ServiceLayer()
	 {
		 System.out.println("Service bean created...");
	 }
}
