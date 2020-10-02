package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class CarPoolingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarPoolingApplication.class, args);
	}

}
