package com.paytmapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = { "com.paytmapp.invoker" })
public class JavaConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
