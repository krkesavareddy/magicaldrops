package com.sk.magicaldrops.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderRequestDto implements Serializable {
    private String caneType;
    private int caneCount;
    private String geolocation;
    private String deliveryAddress;
}
