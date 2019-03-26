package com.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaClient
@EnableHystrix
@SpringBootApplication(scanBasePackages="com")
@EnableFeignClients(basePackages="com")
public class FeignServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(FeignServiceApp.class, args);
	}
}
