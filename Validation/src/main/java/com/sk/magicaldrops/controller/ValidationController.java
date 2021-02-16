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

        return "I am validation service  i am  OK!";
    }
@GetMapping("/phone/{otp}/{phoneNumber}")
    public boolean validatePhoneNumber(String otp,String phoneNumber){
        return validateService.validteOtp(otp,phoneNumber);
    }

    @GetMapping("/address/{phoneNumber}/{address}")
    public boolean validateAddress(String phoneNumber,String address){
        return validateService.validteAddress(phoneNumber,address);
    }
    @GetMapping("/order/{phoneNumber}/{orderId}")
    public boolean validateOrderPlaced(String phoneNumber, String orderId){
        return validateService.validateOrderPlacement(phoneNumber,orderId);
    }
}
