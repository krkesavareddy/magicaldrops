package com.sk.magicaldrops.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
public class ConsumerDto implements Serializable {
    private String name;
    private Long phone;
    private String deliveryAddress;
    private String geolocation;
}
