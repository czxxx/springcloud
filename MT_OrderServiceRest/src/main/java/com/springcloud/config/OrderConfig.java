package com.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import com.netflix.loadbalancer.IRule;

@Configuration
public class OrderConfig {
	//@LoadBalanced表示调用服务实现负载均衡
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Value("${IRule.name}")
	private String ruleName;
	
	@SuppressWarnings("unchecked")
//	@Bean
	public IRule setRule() throws Exception {
		Class<IRule> iRule = (Class<IRule>) this.getClass().getClassLoader().loadClass(ruleName);
		return iRule.newInstance();
	}
}
