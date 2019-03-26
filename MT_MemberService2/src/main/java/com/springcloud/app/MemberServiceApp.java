package com.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
public class MemberServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(MemberServiceApp.class, args);
	}
}
