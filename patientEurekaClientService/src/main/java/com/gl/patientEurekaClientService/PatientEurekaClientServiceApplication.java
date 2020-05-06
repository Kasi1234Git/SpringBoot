package com.gl.patientEurekaClientService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PatientEurekaClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientEurekaClientServiceApplication.class, args);
	}

}
