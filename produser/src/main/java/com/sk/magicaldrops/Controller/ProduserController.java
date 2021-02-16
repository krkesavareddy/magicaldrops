package com.sk.magicaldrops.Controller;

import com.sk.magicaldrops.dto.OrderNoticeRequestDto;
import com.sk.magicaldrops.dto.OrderNotificationResponceDto;
import com.sk.magicaldrops.dto.ProduserRegisterRequestDto;
import com.sk.magicaldrops.service.ProduserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProduserController {
    @Autowired
     ProduserService produserServie;

    @GetMapping("/")
    public String healthCheck() {

        return "I am produser service i am OK!";
    }
    @PostMapping("/register")
    public int registration(@RequestBody ProduserRegisterRequestDto produserRegisterRequestDto){
     return produserServie.registration(produserRegisterRequestDto);
    }
    @GetMapping("/validate/{otp}")
    public String validateOTP(@PathVariable int otp) {
        return produserServie.validateOTP(otp);
    }
    @PostMapping("/ordernotfication")
    public OrderNotificationResponceDto orderRequest(@RequestBody  OrderNoticeRequestDto orderNoticeRequestDto){
        return produserServie.orderRequest(orderNoticeRequestDto);
    }
    @GetMapping("/payment")
    public String payment() {
        return produserServie.payment();
    }
}
