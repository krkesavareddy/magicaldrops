package com.sk.magicaldrops.service;

import com.sk.magicaldrops.dto.ConsumerDto;
import com.sk.magicaldrops.dto.OrderRequestDto;
import com.sk.magicaldrops.dto.OrderResponseDto;
import org.springframework.web.bind.annotation.PathVariable;


public interface ConsumerService {
    public int register(ConsumerDto dto);
    public String validate(int otp);
    public OrderResponseDto orders(OrderRequestDto dto);
    public String payment();
    public boolean deleteorder(int orderId);
}
