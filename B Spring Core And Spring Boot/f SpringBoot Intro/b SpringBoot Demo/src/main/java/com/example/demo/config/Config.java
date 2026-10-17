package com.example.demo.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
	
	public Config()
	{
		System.out.println("Config bean created");
	}
	
	@Bean
	public LocalTime createTime()
	{
		return LocalTime.now();
	}
}
