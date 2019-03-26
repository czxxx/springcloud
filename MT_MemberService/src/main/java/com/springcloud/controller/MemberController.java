package com.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {
	
	@Value("${server.port}")
	private String port;
	private int count;
	@RequestMapping("/getMember")
	public List<String> getMember() {
		List<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");  
		list.add("王五");
		list.add(port);
		System.out.println("service2:"+(++count));
		return list;
	}
	@Autowired
	private DiscoveryClient client;
	@RequestMapping("/getInfo")
	public Object discovery() {
		List<String> services = client.getServices();
		System.out.println(services);
		List<ServiceInstance> list = client.getInstances("SERVICE-MEMBER");
		for (ServiceInstance serviceInstance : list) {
			System.out.println(serviceInstance.getServiceId()+"\t"+serviceInstance.getHost()
			+"\t"+serviceInstance.getPort()+"\t"+serviceInstance.getUri());
		}
		return client;
	}
}
