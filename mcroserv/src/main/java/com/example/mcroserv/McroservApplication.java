package com.example.mcroserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class McroservApplication {

	public static void main(String[] args) {
		SpringApplication.run(McroservApplication.class, args);
	}

}
