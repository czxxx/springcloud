package com.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.springcloud.config.MySelfRule;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
@EnableHystrix
//启动自定义负载均衡算法
@RibbonClient(name="service-member",configuration=MySelfRule.class)
public class OrderServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApp.class, args);
	}
	
	
}
