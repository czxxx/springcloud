package com.springcloud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springcloud.service.OrderServiceFeign;

@RestController
public class FeignController {
	
	@Autowired
	private OrderServiceFeign orderServiceFeign;
	
	@RequestMapping("/getListFeign")
	public List<String> getListFeign() {
		
		return orderServiceFeign.getMember();
	}
	
	@RequestMapping("/getMember")
	public String getMember() {
		
		return "getMember";
	}
	
	@RequestMapping("/getInfo")
	public Object getInfo() {
		
		return orderServiceFeign.getInfo();
	}
 }
