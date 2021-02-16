package com.sk.magicaldrops.service;

import com.sk.magicaldrops.dto.OrderNoticeRequestDto;
import com.sk.magicaldrops.dto.OrderNotificationResponceDto;
import com.sk.magicaldrops.dto.ProduserRegisterRequestDto;

public interface ProduserService {
     public int registration(ProduserRegisterRequestDto produserRegisterRequestDto);
     public String validateOTP(int otp);
   public OrderNotificationResponceDto orderRequest(OrderNoticeRequestDto orderNoticeRequestDto);
    public String payment() ;
}
