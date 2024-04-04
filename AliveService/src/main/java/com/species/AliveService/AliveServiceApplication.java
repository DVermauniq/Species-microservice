package com.species.AliveService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

public class AliveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliveServiceApplication.class, args);
	}

}
