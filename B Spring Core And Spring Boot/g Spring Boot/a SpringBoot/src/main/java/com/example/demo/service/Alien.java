package com.example.demo.service;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Alien 
{
	static 
	{
		System.out.println("Static black : Alien Bean");
	}
	
	{
		System.out.println("Java Instance Block Alien Bean");
	}
	
	public Alien()
	{
		System.out.println("Alien Bean Created");
	}
	
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method of Alien");
	}
	
	public void disp()
	{
		System.out.println("Buisness logic of Alien Class ...");
	}
	
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("---> Bean Destryoed <--- ");
	}
}
