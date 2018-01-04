package com.jim.sbcdemo.sbcwebui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by itlocal on 2017/12/18.
 */
/*@SpringBootApplication
@EnableEurekaClient
@EnableHystrix*/
@Configuration//配置控制
@EnableAutoConfiguration//启用自动配置
@ComponentScan(value={"com.caicongyang.springCloudApp"})//组件扫描
@EnableDiscoveryClient
public class WebApplication {

     public static void main(String[] args) throws Exception {

          SpringApplication.run(WebApplication.class, args);

     }
}
