package com.svc.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegisryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisryApplication.class, args);
	}

}
