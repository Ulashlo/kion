package com.hse.kion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KionApplication {
	public static void main(String[] args) {
		SpringApplication.run(KionApplication.class, args);
	}
}
