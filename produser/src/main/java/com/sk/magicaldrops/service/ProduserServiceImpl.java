package com.sk.magicaldrops.service;

import com.sk.magicaldrops.dto.OrderNoticeRequestDto;
import com.sk.magicaldrops.dto.OrderNotificationResponceDto;
import com.sk.magicaldrops.dto.ProduserRegisterRequestDto;
import org.springframework.stereotype.Service;

@Service
public class ProduserServiceImpl implements ProduserService{
    @Override
    public int registration(ProduserRegisterRequestDto produserRegisterRequestDto) {
       //store the produser data and return the OTP
        return 1010;
    }

    @Override
    public String validateOTP(int otp) {
        //we need to validate the OTP which user has sent againest with our database.
        return "otp validate let him in";
    }

    @Override
    public OrderNotificationResponceDto orderRequest(OrderNoticeRequestDto orderNoticeRequestDto) {
       //we need to fetch order accepted produser details and send this information to consumer who ordered this order
        return new OrderNotificationResponceDto() ;
    }

    @Override
    public String payment() {
        //need to start payment once produser deliveried the can to consumer
        return "your payment has done for XXX order";
    }

}
