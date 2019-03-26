package com.springcloud.service;


import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="service-member",fallback=FallbackService.class)
public interface OrderServiceFeign {

	@RequestMapping("/getMember")
	public List<String> getMember();

	@RequestMapping("/getInfo")
	public Object getInfo();
}
