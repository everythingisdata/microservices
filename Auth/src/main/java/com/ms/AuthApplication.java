package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableDiscoveryClient
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

	// @Bean
	// public AlwaysSampler defaultSampler() {
	// return new AlwaysSampler();
	// }
	
	
}