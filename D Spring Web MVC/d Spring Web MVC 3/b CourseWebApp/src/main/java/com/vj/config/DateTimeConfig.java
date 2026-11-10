package com.vj.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateTimeConfig 
{
	@Bean
	public LocalDateTime time()
	{
		return LocalDateTime.now();
	}

}
