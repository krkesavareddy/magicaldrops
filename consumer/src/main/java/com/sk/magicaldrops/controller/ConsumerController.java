package com.sk.magicaldrops.controller;

import com.sk.magicaldrops.dto.ConsumerDto;
import com.sk.magicaldrops.dto.OrderRequestDto;
import com.sk.magicaldrops.dto.OrderResponseDto;
import com.sk.magicaldrops.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    ConsumerService service;

    @GetMapping("/")
    public String healthCheck() {

        return "I am OK!";
    }

    @PostMapping("/register")
    public int userRegistration(@RequestBody ConsumerDto consumerDto) {

        int i = service.register(consumerDto);
        return i;
    }

    @GetMapping("/validate/{otp}")
    public String validateOTP(@PathVariable int otp) {
        String s = service.validate(otp);
        return s;
    }

    @PostMapping("/orders")
    public OrderResponseDto placeOrder(@RequestBody OrderRequestDto dto) {
        return service.orders(dto);
    }

    /*@DeleteMapping("/order/{orderId}")
    public boolean deleteorder(@PathVariable Integer orderId){
        service.deleteOrder(orderId);
    }
*/
    @GetMapping("/payment")
    public String payment() {

        return service.payment();
    }

}
