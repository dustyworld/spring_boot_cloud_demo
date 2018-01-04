package com.jim.sbcdemo.sbcconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by itlocal on 2017/12/18.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SbcConfigServerApplication {

    public static void main(String[] args){
        SpringApplication.run(SbcConfigServerApplication.class,args);
    }
}
