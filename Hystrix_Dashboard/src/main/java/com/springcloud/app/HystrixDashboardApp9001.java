package com.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages="com")
@EnableHystrixDashboard
public class HystrixDashboardApp9001 {
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApp9001.class, args);
	}
}
