package com.test.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{
	public Config()
	{
		System.out.println("Config Bean is created...");
	}
	
	@Bean
	public Password passwordBean()
	{
		Password pass = new Password("SHA");
		return pass;
	}
}
