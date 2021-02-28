package com.sk.magicaldrops.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
public class ProduserRegisterRequestDto implements Serializable {
    private String shopName;
    private String shopAddress;
    private String geoLocation;
   // private String canTypeAvailable;
    private Long Phone;
}

