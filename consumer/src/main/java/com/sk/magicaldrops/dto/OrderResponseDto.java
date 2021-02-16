package com.sk.magicaldrops.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
public class OrderResponseDto implements Serializable {
    private String caneType;
    private Integer count;
    private String EstimatedTime;
    private Integer price;
    private Long produserPhone;

}
