package com.example.springcloudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudserviceApplication.class, args);
	}

}
