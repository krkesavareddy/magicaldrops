package com.sk.magicaldrops.controller;

import com.sk.magicaldrops.dto.OrderDTO;
import com.sk.magicaldrops.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/")
    public String healthCheck() {
        return "I am order service  i am  OK!";
    }
    @PostMapping("/order")
    public void initiateOrder(@RequestBody OrderDTO dto){
        orderService.initiateOrder(dto);

    }


}
