package com.sk.magicaldrops.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;
@Data
@NoArgsConstructor
public class OrderDTO implements Serializable {
    private Long consumerId;
    private Long consumerPhone;
    private Double consumerOrderedCanPrice;
    private String consumerDelivaryAddress;
    private Map<String ,Integer> consumerOrderList;
}
