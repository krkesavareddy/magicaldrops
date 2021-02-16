package com.sk.magicaldrops.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
public class OrderNotificationResponceDto implements Serializable {
    private Long produserContact;
    private String estimationTime;
}
