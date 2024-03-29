package com.springcloud.controller;

import com.springcloud.service.OrderServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderServiceRest orderService;

    @RequestMapping("/getListRest")
    public List<String> getListRest() {

        return orderService.getList();
    }

}
