package com.emrys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.emrys.filters.SimpleFilter;

@Configuration
public class AppConfiguration {

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();

	}

}
