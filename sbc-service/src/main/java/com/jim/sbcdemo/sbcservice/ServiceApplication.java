package com.jim.sbcdemo.sbcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by itlocal on 2017/12/15.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(ServiceApplication.class,args);
    }

}
