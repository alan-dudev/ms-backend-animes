package com.mx.ile.soft.animes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.mx.ile.soft.commons.models.entity"})
public class MsAnimesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAnimesApplication.class, args);
	}

}
