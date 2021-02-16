package com.sk.magicaldrops.service;

import com.sk.magicaldrops.dto.ConsumerDto;
import com.sk.magicaldrops.dto.OrderRequestDto;
import com.sk.magicaldrops.dto.OrderResponseDto;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService{
    @Override
    public int register(ConsumerDto dto) {
        //we are just saving User detailes and sent OTP to phone for validate.
        return 1010;
    }

    @Override
    public String validate(int otp) {
        //we need to validate the OTP which user has sent againest with our database.
        return "otp validate let him in";
    }

    @Override
    public OrderResponseDto orders(OrderRequestDto dto) {
        //based on dto get the associated producer , caliculate price based on no.of canes and send the response.
        return new OrderResponseDto();
    }

    @Override
    public String payment() {
        //we need to consume external paypal service to perform payment
        return "your payment processed successfully soon you will receive water cane";
    }
}
