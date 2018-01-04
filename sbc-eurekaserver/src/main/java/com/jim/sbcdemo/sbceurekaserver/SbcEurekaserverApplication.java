package com.jim.sbcdemo.sbceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SbcEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcEurekaserverApplication.class, args);
	}

}
