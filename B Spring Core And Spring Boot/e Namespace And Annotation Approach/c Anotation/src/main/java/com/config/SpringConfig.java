package com.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com"})
public class SpringConfig 
{
	public SpringConfig()
	{
		System.out.println("SpringConfig Bean Created ...");
	}
	
	@Bean
	public LocalDateTime createTimeObject()
	{
		return LocalDateTime.now();
	}
}
