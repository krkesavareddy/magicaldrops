package com.sk.magicaldrops.controller;

import com.sk.magicaldrops.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {
    @Autowired
    ValidationService validateService;
    @GetMapping("/")
    public String healthCheck() {

        return "I am OK!";
    }
@GetMapping("/phone/{otp}/{phoneNumber}")
    public boolean validatePhoneNumber(String otp,String phoneNumber){

        boolean b= validateService.validteOtp(otp,phoneNumber);
        return b;
    }

    @GetMapping("/address/{phoneNumber}/{address}")
    public boolean validateAddress(String phoneNumber,String address){
        boolean b=validateService.validteAddress(phoneNumber,address);
        return b;
    }
    @GetMapping("/order/{phoneNumber}/{orderId}")
    public boolean validateOrderPlaced(String phoneNumber, String orderId){
        boolean b= validateService.validateOrderPlacement(phoneNumber,orderId);
        return b;
    }



}
