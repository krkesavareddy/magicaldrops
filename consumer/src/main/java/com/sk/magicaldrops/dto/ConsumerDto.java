package com.sk.magicaldrops.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class ConsumerDto implements Serializable {
    private String name;
    private long phone;
    private String deliveryAddress;
    private String geolocation;
}
