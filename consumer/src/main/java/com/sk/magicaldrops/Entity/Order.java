package com.sk.magicaldrops.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@Entity
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Boolean isDeleted = false;
    private Long customerId;
    private Long phoneNumber;
    private String deliveryAddress;
    private Map<String, Integer> orderCanDetails;
    private Double orderPrice;
    private LocalDateTime orderTime;

    public Order(Boolean isDeleted, Long customerId, Long phoneNumber, String deliveryAddress, Map<String, Integer> orderCanDetails, Double orderPrice, LocalDateTime orderTime) {
        this.isDeleted = false;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.deliveryAddress = deliveryAddress;
        this.orderCanDetails = orderCanDetails;
        this.orderPrice = orderPrice;
        //this.orderTime = LocalDateTime().now();
    }
}
