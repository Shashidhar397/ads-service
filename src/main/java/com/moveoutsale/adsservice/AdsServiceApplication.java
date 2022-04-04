package com.moveoutsale.adsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author shashidhar
 */
@SpringBootApplication
@EnableJpaRepositories
public class AdsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdsServiceApplication.class, args);
	}

}
