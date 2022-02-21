package com.sunglowsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.sunglowsys")
@EntityScan(basePackages = "com.sunglowsys.domain")
@EnableJpaRepositories(basePackages = "com.sunglowsys.repository")
public class RoomTypeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomTypeCrudApplication.class, args);
	}

}
