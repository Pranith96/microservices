package com.online.ecommerce.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcommerceCartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceCartServiceApplication.class, args);
	}

}
