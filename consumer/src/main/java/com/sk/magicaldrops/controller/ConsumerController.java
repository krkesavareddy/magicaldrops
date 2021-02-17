package com.sk.magicaldrops.controller;

import com.sk.magicaldrops.dto.ConsumerDto;
import com.sk.magicaldrops.dto.OrderRequestDto;
import com.sk.magicaldrops.dto.OrderResponseDto;
import com.sk.magicaldrops.service.ConsumerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
public static Logger log = Logger.getLogger(ConsumerController.class);
    @Autowired
    ConsumerService service;
    @GetMapping("/")
    public String healthCheck() {
log.info("helthcheck started in consumer");
        return "I am consumer service i am OK!";
    }

    @PostMapping("/register")
    public int userRegistration(@RequestBody ConsumerDto consumerDto) {
        return service.register(consumerDto);
    }

    @GetMapping("/validate/{otp}")
    public String validateOTP(@PathVariable int otp) {
        return service.validate(otp);
    }

    @PostMapping("/orders")
    public OrderResponseDto placeOrder(@RequestBody OrderRequestDto dto) {
        return service.orders(dto);
    }

    @DeleteMapping("/order/{orderId}")
    public boolean deleteorder(@PathVariable int orderId){
       return service.deleteorder(orderId);
    }

    @GetMapping("/payment")
    public String payment() {
        return service.payment();
    }

}
