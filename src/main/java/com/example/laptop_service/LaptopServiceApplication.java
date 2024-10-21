package com.example.laptop_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication(scanBasePackages={"com.example.laptop-sales-service", "com.speedment.jpastreamer"})
public class LaptopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopServiceApplication.class, args);
	}

}
