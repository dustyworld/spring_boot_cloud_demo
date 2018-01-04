package com.jim.sbcdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class SbcConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcConfigclientApplication.class, args);
	}

	@Value("${swagger.ui.enable}")
	private String foo;

	@RequestMapping(value = "/hi")
	public String hi(){
		return "swagger.ui.enable >>>> "+foo;
	}
}
