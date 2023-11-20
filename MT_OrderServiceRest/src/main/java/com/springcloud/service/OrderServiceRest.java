package com.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceRest {

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @HystrixCommand(fallbackMethod = "orderError")
    public List<String> getList() {

        return restTemplate.getForObject("http://service-member/getMember", List.class);
    }

    public List<String> orderError() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list");
        return listUser;
    }


}
