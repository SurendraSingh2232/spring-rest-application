package com.sunglowsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = "com.sunglowsys")
@EnableJpaRepositories(basePackages = "com.sunglowsys.repository")
@EntityScan(basePackages = "com.sunglowsys.domain")
@EnableTransactionManagement
public class HotelBookingCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingCrudApplication.class, args);
	}

}
