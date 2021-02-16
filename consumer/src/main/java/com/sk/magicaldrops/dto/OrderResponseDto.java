package com.sk.magicaldrops.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class OrderResponseDto implements Serializable {
    private String caneType;
    private int count;
    private String EstimatedTime;
    private int price;
    private long produserPhone;

}
