package com.gl.doctorPortalEurekaClientService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DoctorPortalEurekaClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorPortalEurekaClientServiceApplication.class, args);
	}

}
