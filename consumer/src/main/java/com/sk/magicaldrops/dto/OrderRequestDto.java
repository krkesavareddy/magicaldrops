package com.sk.magicaldrops.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class OrderRequestDto implements Serializable {
    private String caneType;
    private Integer caneCount;
    private String geolocation;
    private String deliveryAddress;
}
