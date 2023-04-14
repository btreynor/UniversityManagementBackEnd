package com.btreynor.spgolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class SpgolfApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpgolfApplication.class, args);
	}

}
