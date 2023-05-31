package com.lwcd.api.ApisGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApisGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApisGatewayApplication.class, args);
	}

}
