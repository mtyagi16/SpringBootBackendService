package com.gfg.mridul.SpringBootBackendService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.gfg.mridul.SpringBootBackendService.controller"})

@SpringBootApplication
public class SpringBootBackendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendServiceApplication.class, args);
	}

}
