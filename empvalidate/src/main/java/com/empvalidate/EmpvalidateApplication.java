package com.empvalidate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class EmpvalidateApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpvalidateApplication.class, args);
	}

}
