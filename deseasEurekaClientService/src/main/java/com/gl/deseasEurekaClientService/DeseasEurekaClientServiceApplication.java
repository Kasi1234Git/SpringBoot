package com.gl.deseasEurekaClientService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeseasEurekaClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeseasEurekaClientServiceApplication.class, args);
	}

}
