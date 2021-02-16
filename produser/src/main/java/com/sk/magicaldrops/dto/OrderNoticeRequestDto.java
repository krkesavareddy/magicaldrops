package com.sk.magicaldrops.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
public class OrderNoticeRequestDto implements Serializable {
    private Integer canCount;
    private String DeliveryAddress;
    private String GeoLocation;
    private Long phone;
    private String canType;

}
