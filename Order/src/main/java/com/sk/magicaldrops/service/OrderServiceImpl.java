package com.sk.magicaldrops.service;

import com.sk.magicaldrops.dto.OrderDTO;
import com.sk.magicaldrops.entity.OrderEntity;
import com.sk.magicaldrops.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
@Autowired
OrderRepository orderRepository;
    @Override
    public void initiateOrder(OrderDTO dto) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setConsumerId(dto.getConsumerId());
        orderEntity.setConsumerPhone(dto.getConsumerPhone());
        orderEntity.setConsumerDeliveryAddress(dto.getConsumerDelivaryAddress());
        orderEntity.setConsumerOrderedCanDetails(dto.getConsumerOrderList());
        orderEntity.setConsumerOrderdCanPrice(dto.getConsumerOrderedCanPrice());

        orderRepository.save(orderEntity);
    }
}
